
package club.pokerfree.java.web.controller;

import club.pokerfree.java.web.model.Registration;
import club.pokerfree.java.web.model.User;
import club.pokerfree.java.web.service.UserService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Alexandr
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("current")
public class UserController  {
    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String user(
            UsernamePasswordAuthenticationToken currentUser,
            @RequestParam(value = "id",required = true, defaultValue = "1")
            Integer id,
            Model model) {
        User u = userService.find(id);
        User current = (User) currentUser.getPrincipal();
        
        model.addAttribute("user", u);
        model.addAttribute("current", current);
        model.addAttribute("title", current.getLogin());
        
        return "user";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        
        return "login";
    }
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(ModelMap model) {
        
        return "registration";
    }
    @RequestMapping(value = "/registered", method = RequestMethod.POST) 
    public String registered(@RequestParam("login") String login,
            @RequestParam("password") String password,
            @RequestParam("email") String email,
            @RequestParam("fullname") String fullname,
            ModelMap model) throws SQLException {
        User u = new User();
        
        u.setLogin(login);
        u.setPassword(password);
        u.setEmail(email);
        u.setFullname(fullname);
        if(u.getEmail().indexOf('@')== -1) {return "login";}
        else{
        userService.insertUser(u);
        model.addAttribute("query", login);
        return "registered"; 
        }
    }
}

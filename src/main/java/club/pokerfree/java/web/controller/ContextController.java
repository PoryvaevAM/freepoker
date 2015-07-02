
package club.pokerfree.java.web.controller;

import club.pokerfree.java.web.model.Faq;
import club.pokerfree.java.web.model.News;
import club.pokerfree.java.web.model.Pokerroom;
import club.pokerfree.java.web.model.Shares;
import club.pokerfree.java.web.service.ContextService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/content")
@SessionAttributes("current")
public class ContextController  {
    @Autowired
    ContextService cs;
    
    @RequestMapping(value = "/faq", method = RequestMethod.GET)
    public String faq(ModelMap model) throws SQLException {
       List <Faq> fl = cs.findAllFaq();
       model.addAttribute("faqs", fl);
       return "faq";
    }
    @RequestMapping(value = "/shares", method = RequestMethod.GET)
    public String shares(ModelMap model) throws SQLException {
        List <Shares> sl = cs.findAllShares();
        model.addAttribute("shares", sl);
        return "shares";
    }
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String news(ModelMap model) throws SQLException {
        List <News> nl = cs.findAllNews();
        model.addAttribute("news", nl);
        return "news";
    }
    @RequestMapping(value = "/pokerrooms", method = RequestMethod.GET)
    public String pokerrooms(ModelMap model) throws SQLException {
        List <Pokerroom> pl = cs.findAllPokerroom();
        model.addAttribute("pokerrooms", pl);
        return "pokerrooms";
    }
    
}

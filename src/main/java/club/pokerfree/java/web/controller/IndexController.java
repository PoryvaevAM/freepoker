package club.pokerfree.java.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(method = RequestMethod.POST)
    public String index(ModelMap model) {
        return "WEB-INF/jsp/index.jsp";
    }
    
}

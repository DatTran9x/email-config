package controller;

import model.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import service.ListService;

@Controller
public class ListController {
    private static final ListService ls = new ListService();

    @GetMapping("/home")
    public ModelAndView homepage(){
        List list = ls.read();
        ModelAndView mav = new ModelAndView("/homepage");
        mav.addObject("list",list);
        return mav;
    }

    @PostMapping("/home")
    public ModelAndView save(@ModelAttribute List list){
        ls.save(list);
        ModelAndView mav = new ModelAndView("/homepage");
        mav.addObject("list",list);
        return mav;
    }
}

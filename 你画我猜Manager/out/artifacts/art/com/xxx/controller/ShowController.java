package com.xxx.controller;

import com.xxx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/show")
public class ShowController {

    @RequestMapping("/showLeft")
    public ModelAndView ShowLeft() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("left");
        return mav;
    }

    @RequestMapping("/showTop")
    public ModelAndView ShowTop() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("top");
        return mav;
    }

    @RequestMapping("/showBody")
    public ModelAndView ShowBody() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("body");
        return mav;
    }
}

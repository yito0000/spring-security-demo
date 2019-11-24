package com.example.springsecuritydemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/home")
    public ModelAndView get() {
        log.info(SecurityContextHolder.getContext().toString());
        return new ModelAndView("views/home");
    }
}

package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private String name;
    private int number;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("action", "doctor");
        return "index";

    }
}
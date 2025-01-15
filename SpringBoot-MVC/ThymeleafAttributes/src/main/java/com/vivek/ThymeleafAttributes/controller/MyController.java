package com.vivek.ThymeleafAttributes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @GetMapping("/openProfile")
    public String openProfilePage(Model model){
        String name = "Vivek Jha";
        model.addAttribute("modelName",name);
        return "profile";
    }

    @GetMapping("/openConditionalPage")
    public String openConditionalPage(Model model){
        int no1= 10;
        int no2 = 20;
        model.addAttribute("number1",no1);
        model.addAttribute("number2",no2);
        return "conditional";
    }

    @GetMapping("/openLoopingPage")
    public String openLoopingPage(Model model){
        List<String> listName = List.of("Vivek Jha","Rajan Kanaujiya","Suraj Singh","Amit Singh");
        model.addAttribute("modelNames",listName);
        return "looping";
    }
}

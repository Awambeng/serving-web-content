package com.awambeng.servingwebcontent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    // @RequestParam is used to bind the value of the request parameter with name "name" to the "name" parameter of the greeting method
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        // adding name parameter to the model to make it accessible to the view
        model.addAttribute("name", name);
        return "greeting";
    }
}

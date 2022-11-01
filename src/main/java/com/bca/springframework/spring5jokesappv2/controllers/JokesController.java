package com.bca.springframework.spring5jokesappv2.controllers;

import com.bca.springframework.spring5jokesappv2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/get-jokes")
public class JokesController {
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

//    @RequestMapping(value = "/joke", method = RequestMethod.GET)
    @GetMapping("/joke")     // method-level
    public String jokes(Model model) {
        model.addAttribute("joke", jokesService.jokes());
        return "index";
    }
}

package com.grace.crabbyweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showRecipe() {

        return "crabcakepage";
    }


    @GetMapping("/btdemo")
    public String showRecipepp() {

        return "btcrabcake";
    }



}

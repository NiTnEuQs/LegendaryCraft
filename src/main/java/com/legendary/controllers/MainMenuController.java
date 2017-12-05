package com.legendary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainMenuController {

    @RequestMapping("/game")
    public String mainMenu(Model model) {
        String pseudo = "Arthas";

        model.addAttribute("pseudo", pseudo);

        return "main_menu";
    }

}

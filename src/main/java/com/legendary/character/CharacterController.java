package com.legendary.character;

import com.legendary.character.enums.Breed;
import com.legendary.character.inventory.ObjectItem;
import com.legendary.character.inventory.ObjectItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class CharacterController {
    @Autowired
    private CharacterRepository characterRepository;
    @Autowired
    private ObjectItemRepository objectItemRepository;


    private final AtomicLong counterItem = new AtomicLong();


    @GetMapping("/game/characters")
    public String characters(Model model) {

        List<Character> characters = characterRepository.findAll();
        model.addAttribute("characters", characters);

        return "characters";
    }

    @RequestMapping("/game/characters/create")
    public String createCharacter(Model model) {
        model.addAttribute("roles", Breed.values());

        return "createCharacter";
    }

    @RequestMapping("/game/characters/{id}")
    public String character(Model model, @PathVariable String id) {
        Character character = characterRepository.findById(id);
        model.addAttribute("character", character);
        ObjectItem arme = character.getInventory().getArme();
        model.addAttribute("arme",arme);

        return "character";
    }

}

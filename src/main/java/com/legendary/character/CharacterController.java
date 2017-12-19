package com.legendary.character;

import com.legendary.character.enums.Breed;
import com.legendary.character.enums.Position;
import com.legendary.character.inventory.ObjectItem;
import com.oracle.tools.packager.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class CharacterController {
    @Autowired
    private CharacterRepository characterRepository;


    private final AtomicLong counterItem = new AtomicLong();


    @GetMapping("/game/characters")
    public String characters(Model model) {

        List<Character> characters = characterRepository.findAll();
        model.addAttribute("characters", characters);

        return "characters";
    }
    @PostMapping("/game/characters")
    public String characters(@ModelAttribute Character character) {

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

        model.addAttribute("arme", character.getInventory().getArme());
        model.addAttribute("bottes", character.getInventory().getBottes());
        model.addAttribute("ceinture", character.getInventory().getCeinture());
        model.addAttribute("cape", character.getInventory().getCape());
        model.addAttribute("chapeau", character.getInventory().getChapeau());
        model.addAttribute("amulette", character.getInventory().getAmulette());
        model.addAttribute("anneau1", character.getInventory().getAnneau1());
        model.addAttribute("anneau2", character.getInventory().getAnneau2());

        model.addAttribute("force", character.getForce());
        model.addAttribute("intelligence", character.getIntelligence());
        model.addAttribute("agilite", character.getAgilite());
        model.addAttribute("sagesse", character.getSagesse());
        model.addAttribute("life", character.getLife());
        model.addAttribute("chance", character.getChance());

        return "character";
    }

    @RequestMapping("/game/characters/{id}/switch/{position}")
    public String character(Model model, @PathVariable String id, @PathVariable Position position) {
        Character character = characterRepository.findById(id);
        ObjectItem item = character.getInventory().getObjectItemByPosition(position);

        model.addAttribute("character", character);
        model.addAttribute("item", item);

        return "switchItem";
    }

    @RequestMapping(value = "/game/characters/{id}/switch/{name}/{newName}", method = RequestMethod.GET)
    public String character(Model model, @PathVariable String id, @PathVariable String name, @PathVariable String newName) {
        Character character = characterRepository.findById(id);
        ObjectItem lastItem = character.getInventory().getObjectItemByName(name);
        ObjectItem newItem = character.getInventory().getObjectItemByName(newName);

        Position tmp = lastItem.getPosition();
        lastItem.setPosition(Position.INVENTORY);
        newItem.setPosition(tmp);

        characterRepository.save(character);

        model.addAttribute("character", character);

        model.addAttribute("arme", character.getInventory().getArme());
        model.addAttribute("bottes", character.getInventory().getBottes());
        model.addAttribute("ceinture", character.getInventory().getCeinture());
        model.addAttribute("cape", character.getInventory().getCape());
        model.addAttribute("chapeau", character.getInventory().getChapeau());
        model.addAttribute("amulette", character.getInventory().getAmulette());
        model.addAttribute("anneau1", character.getInventory().getAnneau1());
        model.addAttribute("anneau2", character.getInventory().getAnneau2());

        model.addAttribute("force", character.getForce());
        model.addAttribute("intelligence", character.getIntelligence());
        model.addAttribute("agilite", character.getAgilite());
        model.addAttribute("sagesse", character.getSagesse());
        model.addAttribute("life", character.getLife());
        model.addAttribute("chance", character.getChance());

        return "character";
    }

}

package com.legendary.controllers;

import com.legendary.model.Character;
import com.legendary.model.Characteristics;
import com.legendary.model.Role;
import com.legendary.model.Stuff;
import com.legendary.model.items.Item;
import com.legendary.model.items.armor.*;
import com.legendary.model.items.weapons.WeaponSwordWood;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class CharacterController {

    private final AtomicLong counterItem = new AtomicLong();

    @RequestMapping("/game/characters/create")
    public String createCharacter(Model model) {
        model.addAttribute("roles", Role.values());

        return "createCharacter";
    }

    @RequestMapping("/game/characters/{id}")
    public String character(Model model, @PathVariable long id) {
        Character character = new Character(id, "Anthonin", Role.ARCHER, 1);
        Item head = new ArmorHelmetWood(counterItem.incrementAndGet(), 1, character);
        Item body = new ArmorChestplateWood(counterItem.incrementAndGet(), 1, character);
        Item hands = new ArmorGauntletsWood(counterItem.incrementAndGet(), 1, character);
        Item legs = new ArmorPantWood(counterItem.incrementAndGet(), 1, character);
        Item feet = new ArmorBootsWood(counterItem.incrementAndGet(), 1, character);
        Item weapon = new WeaponSwordWood(counterItem.incrementAndGet(), 1, character);
        Stuff stuff = new Stuff(head, body, hands, legs, feet, weapon);
        Characteristics characteristics = new Characteristics(100, 100, 20, 15, 3, 14, 14, 14, 14);
        character.setStuff(stuff);
        character.setBaseCharacteristics(characteristics);

        model.addAttribute("character", character);

        return "character";
    }

}

package com.legendary.controllers;

import com.legendary.model.Character;
import com.legendary.model.Characteristics;
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

    @RequestMapping("/game/characters/{{id}}")
    public String character(Model model, @PathVariable long id) {
        Item head = new ArmorHelmetWood(counterItem.incrementAndGet(), 1);
        Item body = new ArmorChestplateWood(counterItem.incrementAndGet(), 1);
        Item hands = new ArmorGauntletsWood(counterItem.incrementAndGet(), 1);
        Item legs = new ArmorPantWood(counterItem.incrementAndGet(), 1);
        Item feet = new ArmorBootsWood(counterItem.incrementAndGet(), 1);
        Item weapon = new WeaponSwordWood(counterItem.incrementAndGet(), 1);
        Stuff stuff = new Stuff(head, body, hands, legs, feet, weapon);
        Character character = new Character(id, "Anthonin", 1, stuff, new Characteristics());

        model.addAttribute("character", character);

        return "character";
    }

}

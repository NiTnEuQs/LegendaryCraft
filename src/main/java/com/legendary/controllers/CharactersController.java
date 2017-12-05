package com.legendary.controllers;

import com.legendary.model.*;
import com.legendary.model.Character;
import com.legendary.model.items.Item;
import com.legendary.model.items.armor.*;
import com.legendary.model.items.weapons.WeaponSwordWood;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class CharactersController {

    private final AtomicLong counterCharacter = new AtomicLong();
    private final AtomicLong counterItem = new AtomicLong();

    @RequestMapping("/game/characters")
    public String characters(Model model) {
        Item head = new ArmorHelmetWood(counterItem.incrementAndGet(), 1);
        Item body = new ArmorChestplateWood(counterItem.incrementAndGet(), 1);
        Item hands = new ArmorGauntletsWood(counterItem.incrementAndGet(), 1);
        Item legs = new ArmorPantWood(counterItem.incrementAndGet(), 1);
        Item feet = new ArmorBootsWood(counterItem.incrementAndGet(), 1);
        Item weapon = new WeaponSwordWood(counterItem.incrementAndGet(), 1);
        Stuff stuff = new Stuff(head, body, hands, legs, feet, weapon);
        Character character1 = new Character(counterCharacter.incrementAndGet(), "Anthonin", 1, stuff, new Characteristics());
        Character character2 = new Character(counterCharacter.incrementAndGet(), "Ludo", 2, stuff, new Characteristics());
        Character character3 = new Character(counterCharacter.incrementAndGet(), "Maxence", 5, stuff, new Characteristics());
        Character character4 = new Character(counterCharacter.incrementAndGet(), "Quentin", 10, stuff, new Characteristics());
        List<Character> characters = new ArrayList<Character>();
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);
        characters.add(character4);

        model.addAttribute("characters", characters);

        return "characters";
    }

}

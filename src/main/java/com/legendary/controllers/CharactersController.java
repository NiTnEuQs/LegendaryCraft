package com.legendary.controllers;

import com.legendary.model.*;
import com.legendary.model.Character;
import com.legendary.model.items.Item;
import com.legendary.model.items.armor.*;
import com.legendary.model.items.weapons.WeaponSwordWood;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class CharactersController {

    private final AtomicLong counterCharacter = new AtomicLong();
    private final AtomicLong counterItem = new AtomicLong();

    @GetMapping("/game/characters")
    public String characters(Model model) {
        //TODO Récupérer les characters de la bdd à la place du code suivant:

        Item head = new ArmorHelmetWood(counterItem.incrementAndGet(), 1, null);
        Item body = new ArmorChestplateWood(counterItem.incrementAndGet(), 1, null);
        Item hands = new ArmorGauntletsWood(counterItem.incrementAndGet(), 1, null);
        Item legs = new ArmorPantWood(counterItem.incrementAndGet(), 1, null);
        Item feet = new ArmorBootsWood(counterItem.incrementAndGet(), 1, null);
        Item weapon = new WeaponSwordWood(counterItem.incrementAndGet(), 1, null);
        Stuff stuff = new Stuff(head, body, hands, legs, feet, weapon);
        Characteristics characteristics = new Characteristics(100, 100, 20, 15, 3, 14, 14, 14, 14);
        Character character1 = new Character(counterCharacter.incrementAndGet(), "Anthonin", Role.WARRIOR, 1, stuff, characteristics);
        Character character2 = new Character(counterCharacter.incrementAndGet(), "Ludo", Role.TANK, 2, stuff, characteristics);
        Character character3 = new Character(counterCharacter.incrementAndGet(), "Maxence", Role.ARCHER, 5, stuff, characteristics);
        Character character4 = new Character(counterCharacter.incrementAndGet(), "Quentin", Role.MAGICIAN, 10, stuff, characteristics);
        Character character5 = new Character(counterCharacter.incrementAndGet(), "Théophile", Role.WARRIOR, 10000000, stuff, characteristics);
        List<Character> characters = new ArrayList<>();
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);
        characters.add(character4);
        characters.add(character5);

        model.addAttribute("characters", characters);

        return "characters";
    }

    @PostMapping(value = "/game/characters")
    public String createCharacter(@ModelAttribute Character character, Model model) {
        //TODO Ajouter le character à la bdd
        System.out.println("Name: " + character.getName());
        System.out.println("Role: " + character.getRole());
        System.out.println("Level: " + character.getLevel());

        //TODO Récupérer les characters de la bdd à la place du code suivant:

        Item head = new ArmorHelmetWood(counterItem.incrementAndGet(), 1, null);
        Item body = new ArmorChestplateWood(counterItem.incrementAndGet(), 1, null);
        Item hands = new ArmorGauntletsWood(counterItem.incrementAndGet(), 1, null);
        Item legs = new ArmorPantWood(counterItem.incrementAndGet(), 1, null);
        Item feet = new ArmorBootsWood(counterItem.incrementAndGet(), 1, null);
        Item weapon = new WeaponSwordWood(counterItem.incrementAndGet(), 1, null);
        Stuff stuff = new Stuff(head, body, hands, legs, feet, weapon);
        Characteristics characteristics = new Characteristics(100, 100, 20, 15, 3, 14, 14, 14, 14);
        Character character1 = new Character(counterCharacter.incrementAndGet(), "Anthonin", Role.WARRIOR, 1, stuff, characteristics);
        Character character2 = new Character(counterCharacter.incrementAndGet(), "Ludo", Role.TANK, 2, stuff, characteristics);
        Character character3 = new Character(counterCharacter.incrementAndGet(), "Maxence", Role.ARCHER, 5, stuff, characteristics);
        Character character4 = new Character(counterCharacter.incrementAndGet(), "Quentin", Role.MAGICIAN, 10, stuff, characteristics);
        Character character5 = new Character(counterCharacter.incrementAndGet(), "Théophile", Role.WARRIOR, 10000000, stuff, characteristics);
        List<Character> characters = new ArrayList<>();
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);
        characters.add(character4);
        characters.add(character5);

        model.addAttribute("characters", characters);

        return "characters";
    }

}

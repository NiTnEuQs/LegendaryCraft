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

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class EquippedItemController {

    private final AtomicLong counterItem = new AtomicLong();

    @RequestMapping("/game/characters/{cid}/{iid}")
    public String equippedItem(Model model, @PathVariable long cid, @PathVariable String iid) {
        Character character = new Character(cid, "Anthonin", Role.WARRIOR, 1);
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

        Item item;

        switch (iid) {
            case "head":
                item = character.getStuff().getHead();
                break;
            case "body":
                item = character.getStuff().getBody();
                break;
            case "hands":
                item = character.getStuff().getHands();
                break;
            case "legs":
                item = character.getStuff().getLegs();
                break;
            case "feet":
                item = character.getStuff().getFeet();
                break;
            case "weapon":
                item = character.getStuff().getWeapon();
                break;
            default:
                item = new ArmorHelmetWood(counterItem.incrementAndGet(), 1, character);
                break;
        }

        model.addAttribute("character", character);
        model.addAttribute("item", item);

        return "equippedItem";
    }

}

package com.legendary.model.items.armor;

import com.legendary.model.Character;
import com.legendary.model.items.Item;

public class ArmorPantWood extends Item {

    public ArmorPantWood(long id, int maxStack, Character owner) {
        super(id, "Pantalon en bois", maxStack, owner);
    }

    @Override
    public void effect() {
        getOwner().addStrength(1);
        getOwner().addIntelligence(5);
        getOwner().addPhysicalResistance(10);
        getOwner().addMagicalResistance(4);
    }

}

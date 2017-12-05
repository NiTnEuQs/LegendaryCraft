package com.legendary.model.items.armor;

import com.legendary.model.items.Item;

public class ArmorPantWood extends Item {

    public ArmorPantWood(long id, int maxStack) {
        super(id, "Pantalon en bois", maxStack);
    }

    @Override
    public void effect() {
        getOwner().addStrength(1);
        getOwner().addIntelligence(5);
        getOwner().addPhysicalResistance(10);
        getOwner().addMagicalResistance(4);
    }

}

package com.legendary.model.items.armor;

import com.legendary.model.Character;
import com.legendary.model.items.Item;

public class ArmorChestplateWood extends Item {

    public ArmorChestplateWood(long id, int maxStack, Character owner) {
        super(id, "Plastron en bois", maxStack, owner);
    }

    @Override
    public void effect() {
        getOwner().addAgility(-2);
        getOwner().addPhysicalResistance(25);
        getOwner().addMagicalResistance(3);
    }

}

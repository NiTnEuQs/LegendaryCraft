package com.legendary.model.items.armor;

import com.legendary.model.Character;
import com.legendary.model.items.Item;

public class ArmorHelmetWood extends Item {

    public ArmorHelmetWood(long id, int maxStack, Character owner) {
        super(id, "Casque en bois", maxStack, owner);
    }

    @Override
    public void effect() {
        getOwner().addPhysicalResistance(5);
    }

}

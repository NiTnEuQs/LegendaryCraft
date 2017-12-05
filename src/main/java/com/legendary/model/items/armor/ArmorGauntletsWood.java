package com.legendary.model.items.armor;

import com.legendary.model.items.Item;

public class ArmorGauntletsWood extends Item {

    public ArmorGauntletsWood(long id, int maxStack) {
        super(id, "Gants en bois", maxStack);
    }

    @Override
    public void effect() {
        getOwner().addPhysicalResistance(2);
        getOwner().addMagicalResistance(7);
    }

}

package com.legendary.model.items.armor;

import com.legendary.model.items.Item;

public class ArmorHelmetWood extends Item {

    public ArmorHelmetWood(long id, int maxStack) {
        super(id, "Casque en bois", maxStack);
    }

    @Override
    public void effect() {
        getOwner().addPhysicalResistance(5);
    }

}

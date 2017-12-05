package com.legendary.model.items.armor;

import com.legendary.model.items.Item;

public class ArmorBootsWood extends Item {

    public ArmorBootsWood(long id, int maxStack) {
        super(id, "Bottes en bois", maxStack);
    }

    @Override
    public void effect() {
        getOwner().addAgility(15);
        getOwner().addMagicalResistance(15);
    }

}

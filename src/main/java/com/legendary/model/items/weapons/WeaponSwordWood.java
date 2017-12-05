package com.legendary.model.items.weapons;

import com.legendary.model.items.Item;

public class WeaponSwordWood extends Item {

    public WeaponSwordWood(long id, int maxStack) {
        super(id, "Epée en bois", maxStack);
    }

    @Override
    public void effect() {
        getOwner().addPhysicalDamage(10);
        getOwner().addStrength(5);
        getOwner().addAgility(2);
        getOwner().addIntelligence(1);
    }

}

package com.legendary.model.items;

import com.legendary.model.Character;

public abstract class Item {

    private final long id;
    private String name;
    private Character owner;
    private int maxStack;
    private int durability;
    private int maxDurability;

    public Item(long id, String name, int maxStack) {
        this.id = id;
        this.name = name;
        this.maxStack = maxStack;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getOwner() {
        return owner;
    }

    public void setOwner(Character owner) {
        this.owner = owner;
    }

    public int getMaxStack() {
        return maxStack;
    }

    public void setMaxStack(int maxStack) {
        this.maxStack = maxStack;
    }

    public abstract void effect();

    @Override
    public String toString() {
        return this.name;
    }
}

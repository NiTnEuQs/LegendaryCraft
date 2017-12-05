package com.legendary.model;

public class Characteristics {

    private int physicalDamage;
    private int magicalDamage;
    private int physicalResistance;
    private int magicalResistance;
    private int strength;
    private int intelligence;
    private int agility;

    public Characteristics() {
        this(0, 0, 0, 0, 0, 0, 0);
    }

    public Characteristics(int strength, int intelligence, int agility, int physicalDamage, int magicalDamage, int physicalResistance, int magicalResistance) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.physicalDamage = physicalDamage;
        this.magicalDamage = magicalDamage;
        this.physicalResistance = physicalResistance;
        this.magicalResistance = magicalResistance;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(int physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public int getMagicalDamage() {
        return magicalDamage;
    }

    public void setMagicalDamage(int magicalDamage) {
        this.magicalDamage = magicalDamage;
    }

    public int getPhysicalResistance() {
        return physicalResistance;
    }

    public void setPhysicalResistance(int physicalResistance) {
        this.physicalResistance = physicalResistance;
    }

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public void setMagicalResistance(int magicalResistance) {
        this.magicalResistance = magicalResistance;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

}

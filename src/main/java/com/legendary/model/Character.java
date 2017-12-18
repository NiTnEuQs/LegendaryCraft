package com.legendary.model;

import java.util.concurrent.atomic.AtomicLong;

public class Character {

    private final long id;
    private String name;
    private Role role;
    private int level;
    private Stuff stuff;
    private Characteristics baseCharacteristics;
    private Characteristics additiveCharacteristics;

    private final static AtomicLong counterCharacter = new AtomicLong();

    public Character() {
        this.id = counterCharacter.incrementAndGet();
        /*
        this.name = "";
        this.role = Role.WARRIOR;
        this.level = 1;
        */
    }

    public Character(long id, String name, Role role, int level) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.level = level;
        this.stuff = new Stuff();
        this.baseCharacteristics = new Characteristics();
        this.additiveCharacteristics = new Characteristics();
    }

    public Character(long id, String name, Role role, int level, Stuff stuff, Characteristics baseCharacteristics) {
        this(id, name, role, level);
        this.stuff = stuff;
        this.baseCharacteristics = baseCharacteristics;
    }

    // Getters/Setters

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Stuff getStuff() {
        return stuff;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }

    public Characteristics getBaseCharacteristics() {
        return baseCharacteristics;
    }

    public void setBaseCharacteristics(Characteristics caracteristics) {
        this.baseCharacteristics = caracteristics;
    }

    public Characteristics getAdditiveCharacteristics() {
        return baseCharacteristics;
    }

    public void setAdditiveCharacteristics(Characteristics caracteristics) {
        this.baseCharacteristics = caracteristics;
    }

    // Functions

    public void updateStuffEffects() {
        setAdditiveCharacteristics(new Characteristics());

        stuff.updateEffects();
    }

    public void addPhysicalDamage(int amount) {
        getAdditiveCharacteristics().setPhysicalDamage(getAdditiveCharacteristics().getPhysicalDamage() + amount);
    }

    public void addMagicalDamage(int amount) {
        getAdditiveCharacteristics().setMagicalDamage(getAdditiveCharacteristics().getMagicalDamage() + amount);
    }

    public void addPhysicalResistance(int amount) {
        getAdditiveCharacteristics().setPhysicalDamage(getAdditiveCharacteristics().getPhysicalDamage() + amount);
    }

    public void addMagicalResistance(int amount) {
        getAdditiveCharacteristics().setMagicalDamage(getAdditiveCharacteristics().getMagicalDamage() + amount);
    }

    public void addStrength(int amount) {
        getAdditiveCharacteristics().setStrength(getAdditiveCharacteristics().getStrength() + amount);
    }

    public void addIntelligence(int amount) {
        getAdditiveCharacteristics().setIntelligence(getAdditiveCharacteristics().getIntelligence() + amount);
    }

    public void addAgility(int amount) {
        getAdditiveCharacteristics().setAgility(getAdditiveCharacteristics().getAgility() + amount);
    }

}

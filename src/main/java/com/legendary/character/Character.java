package com.legendary.character;

import com.legendary.character.characteristics.Characteristics;
import com.legendary.character.enums.Breed;
import com.legendary.character.inventory.Inventory;
import org.springframework.data.annotation.Id;

public class Character {

    @Id
    private String id;

    private String name;
    private Breed breed;
    private Characteristics stats;
    private Inventory inventory;
    //private Stuff stuff;
    private int level;
    // Stats du personnage


    public Character() {

    }

    public Character(String name, Breed breed, int level) {
        this.name = name;
        this.breed = breed;
        this.level = level;
        this.stats = new Characteristics();
        this.inventory = new Inventory(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Functions

  /*  public void updateStuffEffects() {
        setAdditiveCharacteristics(new Characteristics());

        stuff.updateEffects();
    }*/

  /*  public void addPhysicalDamage(int amount) {
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
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Characteristics getStats() {
        return stats;
    }

    public void setStats(Characteristics stats) {
        this.stats = stats;
    }
}

package com.legendary.model;

import com.legendary.model.items.Item;

public class Stuff {

    private Item head;
    private Item body;
    private Item hands;
    private Item legs;
    private Item feet;
    private Item weapon;

    public Stuff() {

    }

    public Stuff(Item head, Item body, Item hands, Item legs, Item feet, Item weapon) {
        this.head = head;
        this.body = body;
        this.hands = hands;
        this.legs = legs;
        this.feet = feet;
        this.weapon = weapon;
    }

    // Getters/Setters

    public Item getHead() {
        return head;
    }

    public void setHead(Item head) {
        this.head = head;
    }

    public Item getBody() {
        return body;
    }

    public void setBody(Item body) {
        this.body = body;
    }

    public Item getHands() {
        return hands;
    }

    public void setHands(Item hands) {
        this.hands = hands;
    }

    public Item getLegs() {
        return legs;
    }

    public void setLegs(Item legs) {
        this.legs = legs;
    }

    public Item getFeet() {
        return feet;
    }

    public void setFeet(Item feet) {
        this.feet = feet;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }


    // Functions

    public void updateEffects() {
        getHead().effect();
        getBody().effect();
        getHands().effect();
        getLegs().effect();
        getFeet().effect();
        getWeapon().effect();
    }

}

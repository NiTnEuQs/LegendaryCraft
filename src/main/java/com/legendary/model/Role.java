package com.legendary.model;

public enum Role {

    WARRIOR("Guerrier", "warrior.png"),
    ARCHER("Archer", "archer.png"),
    MAGICIAN("Magicien", "magician.png"),
    TANK("Défenseur", "tank.png");

    private final int id;
    private final String text;
    private final String imgName;

    Role(final String text, final String imgName) {
        this.id = ordinal();
        this.text = text;
        this.imgName = imgName;
    }

    @Override
    public String toString() {
        return text;
    }

}

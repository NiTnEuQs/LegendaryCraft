package com.legendary.character.enums;

public enum Breed {

    IOP("Iop","warrior.png"),
    CRA("Cra","archer.png"),
    FECA("Feca","magician.png"),
    SACRIEUR("Sacrieur","tank.png");


    private final int id;
    private final String text;
    private final String imgName;

    Breed(final String text, final String imgName) {
        this.id = ordinal();
        this.text = text;
        this.imgName = imgName;
    }

    @Override
    public String toString() {
        return text;
    }

}


package com.legendary.character.inventory;

import com.legendary.character.enums.TypeStats;

import java.lang.reflect.Type;

/**
 * Created by ludovicgoldak on 19/12/2017.
 */
public class ObjectEffect {
    private TypeStats typeStats;
    private int value;

    public ObjectEffect(TypeStats typeStats, int value){
        this.typeStats = typeStats;
        this.value = value;
    }

    public TypeStats getTypeStats() {
        return typeStats;
    }

    public void setTypeStats(TypeStats typeStats) {
        this.typeStats = typeStats;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

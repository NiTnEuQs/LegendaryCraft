package com.legendary.character.inventory;

import com.legendary.character.Character;
import com.legendary.character.enums.Position;
import com.legendary.character.enums.TypeStats;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;

/**
 * Created by ludovicgoldak on 19/12/2017.
 */
public class Inventory {

    @Ignore
    private Character owner;

    private ArrayList<ObjectItem> objectsItem = new ArrayList();

    public Inventory() {

    }

    public Inventory(Character character) {
        this.owner = owner;
    }


    private ObjectItem getObjectItemEmpty() {
        ObjectItem item = new ObjectItem();
        item.setPosition(Position.INEXISTANT);
        item.setName("Inexistant");
        item.setObjectUID("-1");
        item.setOwnerId("-1");
        return item;
    }

    public ObjectItem getObjectItemByPosition(Position position) {
        for (ObjectItem objectItem : objectsItem) {
            if (objectItem.getPosition() == position) {
                return objectItem;
            }
        }
        return getObjectItemEmpty();
    }

    public ObjectItem getObjectItemByName(String name) {
        for (ObjectItem objectItem : objectsItem) {
            if (objectItem.getName() == name) {
                return objectItem;
            }
        }
        return getObjectItemEmpty();
    }

    public ObjectItem getArme() {
        return getObjectItemByPosition(Position.ARME);
    }

    public ObjectItem getBottes() {
        return getObjectItemByPosition(Position.BOTTES);
    }

    public ObjectItem getCeinture() {
        return getObjectItemByPosition(Position.CEINTURE);
    }

    public ObjectItem getCape() {
        return getObjectItemByPosition(Position.CAPE);
    }

    public ObjectItem getChapeau() {
        return getObjectItemByPosition(Position.CHAPEAU);
    }

    public ObjectItem getAmulette() {
        return getObjectItemByPosition(Position.AMULETTE);
    }

    public ObjectItem getAnneau1() {
        return getObjectItemByPosition(Position.ANNEAU1);
    }

    public ObjectItem getAnneau2() {
        return getObjectItemByPosition(Position.ANNEAU2);
    }

    public int getAdditionalStats(TypeStats typestats) {
        int value = 0;
        for (ObjectItem objectItem : objectsItem) {
            if (objectItem.getPosition() != Position.INEXISTANT && objectItem.getPosition() != Position.INVENTORY){
                for(ObjectEffect objectEffect: objectItem.getEffects()){
                    if(objectEffect.getTypeStats() == typestats){
                        value += objectEffect.getValue();
                    }
                }
            }
        }
        return value;
    }


    public ArrayList<ObjectItem> getObjectsItem() {
        return objectsItem;
    }

    public void setObjectsItem(ArrayList<ObjectItem> objectsItem) {
        this.objectsItem = objectsItem;
    }
}

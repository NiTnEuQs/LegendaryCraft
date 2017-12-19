package com.legendary.character.inventory;

import com.legendary.character.Character;
import com.legendary.character.CharacterRepository;
import com.legendary.character.enums.Position;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ludovicgoldak on 19/12/2017.
 */
public class Inventory {
    @Autowired
    private ObjectItemRepository objectItemRepository;

    @Ignore
    private Character owner;

    private ArrayList<ObjectItem> objectsItem = new ArrayList();

    public Inventory(){

    }

    public Inventory(Character character) {
        this.owner = owner;
    }


    private ObjectItem getObjectItemEmpty(){
        ObjectItem item = new ObjectItem();
        item.setPosition(Position.INEXISTANT);
        item.setName("Inexistant");
        item.setObjectUID("-1");
        item.setOwnerId("-1");
        return item;
    }

    public ObjectItem getObjectItemByPosition( Position position){
        for (ObjectItem objectItem : objectsItem) {
            if(objectItem.getPosition() == position){
                return objectItem;
            }
        }
        return getObjectItemEmpty();
    }

    public ObjectItem getArme(){
        return getObjectItemByPosition(Position.ARME);
    }
    public ObjectItem getBottes(){
        return getObjectItemByPosition(Position.BOTTES);
    }
    public ObjectItem getCeinture(){
        return getObjectItemByPosition(Position.CEINTURE);
    }
    public ObjectItem getCape(){
        return getObjectItemByPosition(Position.CAPE);
    }
    public ObjectItem getChapeau(){
        return getObjectItemByPosition(Position.CHAPEAU);
    }
    public ObjectItem getAmulette(){
        return getObjectItemByPosition(Position.AMULETTE);
    }
    public ObjectItem getAnneau1(){
        return getObjectItemByPosition(Position.ANNEAU1);
    }
    public ObjectItem getAnneau2(){
        return getObjectItemByPosition(Position.ANNEAU2);
    }


    public ArrayList<ObjectItem> getObjectsItem() {
        return objectsItem;
    }

    public void setObjectsItem(ArrayList<ObjectItem> objectsItem) {
        this.objectsItem = objectsItem;
    }
}

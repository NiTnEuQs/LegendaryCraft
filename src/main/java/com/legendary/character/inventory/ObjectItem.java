package com.legendary.character.inventory;

import com.legendary.character.enums.Position;
import com.legendary.character.enums.TypeItem;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ludovicgoldak on 19/12/2017.
 */
public class ObjectItem {
    @Id
    private String objectUID;

    private String name;
    private String description;
    private String ownerId;
    private Position position;
    private ArrayList<ObjectEffect> effects = new ArrayList();
    private int maxDurability = 100000;
    private double wearSpeed= 100;
    private int creationTime;
    private TypeItem typeItem;

    public ObjectItem() {

    }

    public ObjectItem(String name, String description, String ownerId, Position position, TypeItem typeItem) {
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.position = position;
        this.creationTime = (int) (new Date().getTime()/1000);
        this.typeItem = typeItem;
    }

    public double getDurability(){
        int i = (int) (new Date().getTime()/1000);
        int dureeUtilisation = i - creationTime;
        double durabiltiy = maxDurability - ( dureeUtilisation * wearSpeed);
        if (durabiltiy < 0)
            return 0;
        else return durabiltiy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjectUID() {
        return objectUID;
    }

    public void setObjectUID(String objectUID) {
        this.objectUID = objectUID;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public ArrayList<ObjectEffect> getEffects() {
        return effects;
    }

    public void setEffects(ArrayList<ObjectEffect> effects) {
        this.effects = effects;
    }

    public int getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(int creationTime) {
        this.creationTime = creationTime;
    }


    public int getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(int maxDurability) {
        this.maxDurability = maxDurability;
    }

    public double getWearSpeed() {
        return wearSpeed;
    }

    public void setWearSpeed(double wearSpeed) {
        this.wearSpeed = wearSpeed;
    }

    public TypeItem getTypeItem() {
        return typeItem;
    }

    public void setTypeItem(TypeItem typeItem) {
        this.typeItem = typeItem;
    }
}

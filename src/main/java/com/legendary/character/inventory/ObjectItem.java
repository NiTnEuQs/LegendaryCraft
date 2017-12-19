package com.legendary.character.inventory;

import com.legendary.character.enums.Position;
import org.springframework.data.annotation.Id;

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

    public ObjectItem() {

    }

    public ObjectItem(String name, String description, String ownerId, Position position) {
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
        this.position = position;
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
}

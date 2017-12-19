package com.legendary.character.inventory;

import com.legendary.character.Character;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ludovicgoldak on 19/12/2017.
 */

@Repository
public interface ObjectItemRepository extends MongoRepository<ObjectItem, String> {

    public ObjectItem findByObjectUID(String objectUID);

    public List<ObjectItem> findByOwnerId(String ownerId);
}

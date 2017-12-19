package com.legendary;

import com.legendary.character.Character;
import com.legendary.character.CharacterRepository;
import com.legendary.character.enums.Breed;
import com.legendary.character.enums.Position;
import com.legendary.character.inventory.ObjectItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private ObjectItemRepository objectItemRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


        initCharacters();
        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Character customer : characterRepository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();


    }


    public void initCharacters(){
        characterRepository.deleteAll();
       // objectItemRepository.deleteAll();
        // save a couple of customers
        Character character1 = new Character("Ludo", Breed.SACRIEUR,3);
        ObjectItem item1 = new ObjectItem("Faux du paysan", "Permet de cultiver le blé et faire quelque dégats",character1.getId(), Position.ARME);
        //objectItemRepository.save(item1);
        character1.getInventory().getObjectsItem().add(item1);
        character1.getStats().setInitalIntelligence(100);
        character1.getStats().setInitalLife(1000);
        character1.getStats().setInitialAgilite(200);
        character1.getStats().setInitialForce(300);
        character1.getStats().setInitialSagesse(100);

        characterRepository.save(character1);
    }

}
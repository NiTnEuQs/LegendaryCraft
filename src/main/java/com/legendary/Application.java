package com.legendary;

import com.legendary.character.Character;
import com.legendary.character.CharacterRepository;
import com.legendary.character.enums.Breed;
import com.legendary.character.enums.Position;
import com.legendary.character.enums.TypeStats;
import com.legendary.character.inventory.ObjectEffect;
import com.legendary.character.inventory.ObjectItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private CharacterRepository characterRepository;

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
        item1.getEffects().add(new ObjectEffect(TypeStats.FORCE,40));
        item1.getEffects().add(new ObjectEffect(TypeStats.INTELLIGENCE,40));
        ObjectItem item2 = new ObjectItem("Coiffe du bouftou", "Superbe coif de bouf",character1.getId(), Position.CHAPEAU);
        item2.getEffects().add(new ObjectEffect(TypeStats.FORCE,30));
        item2.getEffects().add(new ObjectEffect(TypeStats.INTELLIGENCE,30));
        ObjectItem item3 = new ObjectItem("Cape du bouftou", "Superbe cape de bouftout",character1.getId(), Position.CAPE);
        ObjectItem item4 = new ObjectItem("Anneau du bouftou", "Superbe anneau du bouftou",character1.getId(), Position.ANNEAU1);
        ObjectItem item5 = new ObjectItem("Botte du bouftou", "Superbe botte du bouftout",character1.getId(), Position.BOTTES);
        ObjectItem item6 = new ObjectItem("Ceinture du bouftout", "Permet de cultiver le blé et faire quelque dégats",character1.getId(), Position.CEINTURE);
        ObjectItem item7 = new ObjectItem("Ceinture du tofu", "Blablabla",character1.getId(), Position.INVENTORY);


        //objectItemRepository.save(item1);
        character1.getInventory().getObjectsItem().add(item1);
        character1.getInventory().getObjectsItem().add(item2);
        character1.getInventory().getObjectsItem().add(item3);
        character1.getInventory().getObjectsItem().add(item4);
        character1.getInventory().getObjectsItem().add(item5);
        character1.getInventory().getObjectsItem().add(item6);
        character1.getInventory().getObjectsItem().add(item7);

        character1.getStats().setInitialIntelligence(100);
        character1.getStats().setInitialLife(1000);
        character1.getStats().setInitialAgilite(200);
        character1.getStats().setInitialForce(300);
        character1.getStats().setInitialSagesse(100);

        characterRepository.save(character1);
    }

}
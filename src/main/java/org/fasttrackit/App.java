package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Hello AnimalRescuer!");

        Animal animalReference = new Animal("Izzy", "Beef", "Toy");
        animalReference.setName("Izzy");
        animalReference.setAge(4);
        animalReference.setHealthLevel(10);
        animalReference.setHungerLevel(5);
        animalReference.setMoodLevel(10);
        animalReference.setFavouriteGame("Toy");
        animalReference.setFavouriteFood("Beef");

        Cat cat = new Cat("Lilu", "Mouse", "Scratch");
        boolean purrs = true;

        Rescuer rescuerReference = new Rescuer("Mara");
        rescuerReference.setName("Mara");
        rescuerReference.setBudget(100);


        Food foodReference = new Food("Advance", 50, 10);
        foodReference.setName("Advance");
        foodReference.setPrice(50);
        foodReference.setExpirationDate( LocalDate.of(2022, 10, 2));
        foodReference.setQuantity(10);

        rescuerReference.feed(animalReference, foodReference);




        foodReference.setDisponibility(true);

        Activity activityReference = new Activity("Running");
        activityReference.setName("Running");

        rescuerReference.play(animalReference, activityReference);

        Vet vetReference = new Vet("Jack");
        vetReference.setName("Jack");
        vetReference.setDegree("Veterinary");
        Game gameReference = new Game();



         Dog dog = new Dog("Izzy", "Beef", "Running");
         dog.setBite(false);


    }

}

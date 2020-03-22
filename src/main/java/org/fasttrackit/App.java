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
        animalReference.name = "Izzy";
        animalReference.age = 4;
        animalReference.healthLevel = 10;
        animalReference.hungerLevel = 5;
        animalReference.moodLevel =  10;
        animalReference.favouriteGame = "Toy";
        animalReference.favouriteFood = "Beef";

        Rescuer rescuerReference = new Rescuer("Mara");
        rescuerReference.name = "Mara";
        rescuerReference.budget = 100;

        Food foodReference = new Food("Advance", 50, 10);
        foodReference.name = "Advance";
        foodReference.price = 50;
        foodReference.expirationDate =  LocalDate.of(2022, 10, 2);
        foodReference.quantity = 10;




        foodReference.disponibility = true;

        Activity activityReference = new Activity("Running");
        activityReference.name = "Running";

        Vet vetReference = new Vet("Jack");
        vetReference.name = "Jack";
        vetReference.degree = "Veterinary";
        Game gameReference = new Game();

         MyPet myPet = new MyPet("Yogo", "Beef", "Toy");
         myPet.color = "White and Brown";
         myPet.weight = 10;


         Dog dog = new Dog("Izzy", "Beef", "Running");
         dog.bite = false;



















    } }

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

        Animal animalReference = new Animal();
        animalReference.name = "Izzy";
        animalReference.age = 4;
        animalReference.healthLevel = 10;
        animalReference.hungerLevel = 5;
        animalReference.moodLevel =  10;
        animalReference.favouriteGame = "Toy";
        animalReference.favouriteFood = "Beef";

        Rescuer rescuerReference = new Rescuer();
        rescuerReference.name = "Mara";
        rescuerReference.budget = 100;

        Food foodReference = new Food();
        foodReference.name = "Advance";
        foodReference.price = 50;
        foodReference.expirationDate =  LocalDate.of(2022, 10, 2);
        foodReference.quantity = 10;




        foodReference.disponibility = true;

        Activity activityReference = new Activity();
        activityReference.name = "Running";

        Vet vetReference = new Vet();
        vetReference.name = "Jack";
        vetReference.degree = "Veterinary";
        Game gameReference = new Game();










    } }

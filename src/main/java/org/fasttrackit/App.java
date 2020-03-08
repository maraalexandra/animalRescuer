package org.fasttrackit;

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
        animalReference.healthLevel = 1 - 10;
        animalReference.hungerLevel = -9;
        animalReference.moodLevel = 1 - 10;
        animalReference.favouriteGame = "Toy";
        animalReference.favouriteFood = "Beef";

        Rescuer rescuerReference = new Rescuer();
        rescuerReference.name = "Mara";
        rescuerReference.budget = 100;

        Food foodReference = new Food();
        foodReference.name = "Advance";
        foodReference.price = 50;

        foodReference.expirationDate = new Date(2022, 6, 26);
        foodReference.disponibility = true;

        Activity activityReference = new Activity();
        activityReference.name = "Running";

        Vet vetReference = new Vet();
        vetReference.name = "Jack";
        vetReference.degree = "Veterinary";
        Game gameReference = new Game;
        gameReference.animal = "Dog";
        gameReference.Rescuer = "Mara";
        gameReference.Vet = "Jack";








    } }

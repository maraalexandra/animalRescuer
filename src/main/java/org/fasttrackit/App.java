package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello AnimalRescuer!" );

        Animal animalReference = new Animal();
        animalReference.name = "Izzy";
        animalReference.age = 4;
        animalReference.health = 10;
        animalReference.hungerness = 1-10;
        animalReference.mood = 1-10;
        animalReference.favouriteGame = "Toy";

        Rescuer rescuerReference = new Rescuer();
        rescuerReference.name = "Mara";
        rescuerReference.budget = 100;

        Food foodReference = new Food();
        foodReference.name = "Advance";
        foodReference.price = 50;
        foodReference.expirationDate = 2022;
        foodReference.disponibility = true;

        Activity activityReference = new Activity();
        activityReference.name = "Running";

        Vet vetReference = new Vet();
        vetReference.name = "Jack";
        vetReference.degree= "Veterinary";





    } }

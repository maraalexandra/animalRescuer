package org.fasttrackit;

public class Rescuer {

    String name;
    int budget;

    public Rescuer(String name) {
        this.name = name;

    }

    public void feed(Animal animal, Food food) {

        System.out.println(name + " just gave some " + food.name + " food to " + animal.name);

        animal.hungerLevel = 1;

    }

    public void play(Animal animal, Activity activity) {

        System.out.println(name + " is " + activity.name + " with " + animal.name);

        animal.moodLevel = 10;



    }

}

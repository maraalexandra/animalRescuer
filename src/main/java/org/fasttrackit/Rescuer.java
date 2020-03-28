package org.fasttrackit;

public class Rescuer {

    private String name;
    private int budget;

    public Rescuer(String name) {
        this.name = name;

    }

    public void feed(Animal animal, Food food) {

        System.out.println(name + " just gave some " + food.getName()+ " food to " + animal.getName());


        if (animal.getFavouriteFood().equals(food.getName())) {

            animal.setHungerLevel(animal.getHungerLevel()+1);
        }

        }

        public void play(Animal animal, Activity activity){
            System.out.println(name + " is " + activity.getName() + " with " + animal.getName());

            if (animal.getFavouriteGame().equals(activity.getName())){


                animal.setMoodLevel(animal.getMoodLevel() +2);


            }

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
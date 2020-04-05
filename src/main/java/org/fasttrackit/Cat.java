package org.fasttrackit;

public class Cat extends Animal {


    private boolean purrs;

    @Override
    public void showingHappinessState() {
        System.out.println("This cat is purring");

    }

    public Cat(String name, String favouriteFood, String favouriteGame){

        super(name, favouriteFood, favouriteGame);
    }

    public boolean isPurrs() {
        return purrs;
    }

    public void setPurrs(boolean purrs) {
        this.purrs = purrs;
    }
}

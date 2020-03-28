package org.fasttrackit;

public class Dog extends Animal {

    private boolean bite;


    public Dog(String name, String favouriteFood, String favouriteGame) {
        super(name, favouriteFood, favouriteGame);
    }

    public boolean isBite() {
        return bite;
    }

    public void setBite(boolean bite) {
        this.bite = bite;
    }
}

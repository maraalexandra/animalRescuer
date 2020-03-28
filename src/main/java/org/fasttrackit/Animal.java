package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String favouriteFood;
    private String favouriteGame;

    public Animal(String name, String favouriteFood, String favouriteGame) {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.favouriteGame = favouriteGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    public void setFavouriteGame(String favouriteGame) {
        this.favouriteGame = favouriteGame;
    }
}

package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

public class Food {

    String name;
    int price;
    LocalDate expirationDate;
    boolean disponibility;
    int quantity;

    public Food(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}


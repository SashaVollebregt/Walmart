package com.capgemini;

import java.util.ArrayList;

public abstract class Customer {

    private String name;
    ArrayList<Item> basket = new ArrayList<Item>();

    /**
     * Getters and Setters
     * @return
     */
    public ArrayList<Item> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Item> basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Customer constructor
     * @param name
     */

    public Customer (String name){
        this.name = name;

    }

    /**
     * Method that greets the customer
     */
    public abstract void greeting();

    /**Method that adds item to basket (ArrayList)
     *
     * @param item
     */
    public abstract void addItemToBasket(Item item);

}

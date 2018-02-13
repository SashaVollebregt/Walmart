package com.capgemini;

public class Item {

    private String name;
    private int price;


    /**
     * Getters and Setters
     * @return
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Item constructor
     * @param name
     * @param price
     */
    public Item (String name, int price, String discountOffer){
        this.name = name;
        this.price = price;
    }
}

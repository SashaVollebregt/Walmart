package com.capgemini;

import java.util.ArrayList;

public interface IRegister {

    /**
     *The implementation needs to calculate the total price of items in basket
     *
     */
    void calculateTotalPrice(ArrayList<Item> basket);


    /**
     * The implementation needs to calculate the total discount of items in basket
     *
     */
    void calculateDiscount(ArrayList<Item> basket);


    /**
     * The implementation needs to calculate the total price without discount
     */
    void checkOut(Customer customer);

}

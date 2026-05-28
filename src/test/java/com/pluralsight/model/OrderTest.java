package com.pluralsight.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void shouldCalculateOrderTotal() {

        Order order = new Order();

        Drink drink = new Drink(
                DrinkSize.SMALL,
                "Coke");

        Chips chips = new Chips(
                ChipType.BBQ);

        order.addItem(drink);
        order.addItem(chips);

        assertEquals(
                3.50,
                order.getTotalPrice());
    }

}
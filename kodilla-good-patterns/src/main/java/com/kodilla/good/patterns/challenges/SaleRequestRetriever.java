package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SaleRequestRetriever {

    public SaleRequest retrieve() {

        User user = new User("Lukasz", "Lucko");
        Item item = new Item("PC", 100);
        LocalDate time = LocalDate.now();

        return new SaleRequest(user, item, time);
    }
}
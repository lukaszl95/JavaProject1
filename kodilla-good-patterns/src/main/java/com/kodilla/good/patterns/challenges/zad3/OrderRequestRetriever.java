package com.kodilla.good.patterns.challenges.zad3;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieveExtraShop() {

        User userExtraShop = new User("John", "Wick");
        Order orderExtraShop = new Order("Milk", 2, 1);
        LocalDate timeExtraShop = LocalDate.now();

        return new OrderRequest(userExtraShop, orderExtraShop, timeExtraShop, OrderServiceFactory.EXTRAFOODSHOP);
    }

    public OrderRequest retrieveHealthyShop() {

        User userHealthyShop = new User("John", "Rambo");
        Order orderHealthyShop = new Order("Soy", 2, 1);
        LocalDate timeHealthyShop = LocalDate.now();

        return new OrderRequest(userHealthyShop, orderHealthyShop, timeHealthyShop, OrderServiceFactory.HEALTHYSHOP);
    }

    public OrderRequest retrieveGlutenShop() {

        User userGlutenShop = new User("John", "Lennon");
        Order orderGlutenShop = new Order("Bread", 2, 1);
        LocalDate timeGlutenShop = LocalDate.now();

        return new OrderRequest(userGlutenShop, orderGlutenShop, timeGlutenShop, OrderServiceFactory.GLUTENFREESHOP);
    }
}
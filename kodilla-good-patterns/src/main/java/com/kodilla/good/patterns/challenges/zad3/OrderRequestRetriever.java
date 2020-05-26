package com.kodilla.good.patterns.challenges.zad3;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieveExtraShop() {

        User userExtraShop = new User("John", "Wick");
        Order orderExtraShop = new Order("Milk", 2, 1,"ES");
        LocalDate timeExtraShop = LocalDate.now();

        return new OrderRequest(userExtraShop, orderExtraShop, timeExtraShop, orderExtraShop.getShop());
    }

    public OrderRequest retrieveHealthyShop() {

        User userHealthyShop = new User("John", "Rambo");
        Order orderHealthyShop = new Order("Soy", 2, 1,"HS");
        LocalDate timeHealthyShop = LocalDate.now();

        return new OrderRequest(userHealthyShop, orderHealthyShop, timeHealthyShop, orderHealthyShop.getShop());
    }

    public OrderRequest retrieveGlutenShop() {

        User userGlutenShop = new User("John", "Lennon");
        Order orderGlutenShop = new Order("Bread", 2, 1,"GS");
        LocalDate timeGlutenShop = LocalDate.now();

        return new OrderRequest(userGlutenShop, orderGlutenShop, timeGlutenShop, orderGlutenShop.getShop());
    }
}
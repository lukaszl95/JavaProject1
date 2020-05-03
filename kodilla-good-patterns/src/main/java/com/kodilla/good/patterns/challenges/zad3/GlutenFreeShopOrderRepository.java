package com.kodilla.good.patterns.challenges.zad3;

import java.time.LocalDate;

public class GlutenFreeShopOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Order order, LocalDate time) {
        return true;
    }
}
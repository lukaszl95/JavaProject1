package com.kodilla.good.patterns.challenges.zad3;

import java.time.LocalDate;

public class GlutenFreeShopOrderService implements OrderService {
    @Override
    public boolean order(User user, Order order, LocalDate time) {
        return true;
    }
}
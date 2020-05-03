package com.kodilla.good.patterns.challenges.zad3;

import java.time.LocalDate;

public interface OrderRepository {

    boolean createOrder(User user, Order order, LocalDate time);
}
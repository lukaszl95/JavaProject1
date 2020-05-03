package com.kodilla.good.patterns.challenges.zad2;

import java.time.LocalDate;

public interface ItemSaleRepository {

    boolean createSale(User user, Item item, LocalDate time);

}
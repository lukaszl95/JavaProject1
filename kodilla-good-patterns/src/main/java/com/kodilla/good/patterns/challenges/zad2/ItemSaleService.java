package com.kodilla.good.patterns.challenges.zad2;

import java.time.LocalDate;

public interface ItemSaleService {

    boolean sale(User user, Item item, LocalDate time);

}
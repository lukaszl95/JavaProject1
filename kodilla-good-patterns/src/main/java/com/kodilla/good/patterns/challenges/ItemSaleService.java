package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface ItemSaleService {

    boolean sale(User user, Item item, LocalDate time);

}
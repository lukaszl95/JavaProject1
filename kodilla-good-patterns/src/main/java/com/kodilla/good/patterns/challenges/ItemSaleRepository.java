package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface ItemSaleRepository {

    boolean createSale(User user, Item item, LocalDate time);

}
package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ItemsSaleService implements ItemSaleService {
    @Override
    public boolean sale(User user, Item item, LocalDate time) {
        return true;
    }
}
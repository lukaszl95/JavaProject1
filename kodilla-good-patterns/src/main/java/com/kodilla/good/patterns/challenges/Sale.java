package com.kodilla.good.patterns.challenges;

public class Sale {

    private User user;
    private boolean isSold;

    public Sale(User user, boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return isSold;
    }
}

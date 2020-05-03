package com.kodilla.good.patterns.challenges.zad3;

public class MailService implements MailInformation {

    @Override
    public void inform(User user, Order order) {

        System.out.println("Hello " + user.getUserName() + " " + user.getUserSurname() + "!");
        System.out.println("You just ordered " + order.getQuantity() + " x " + order.getProduct() + " for " + order.getPrice() + " $ per unit.");
        System.out.println("Final cost: " + (order.getQuantity() * order.getPrice()) + "$");
    }
}
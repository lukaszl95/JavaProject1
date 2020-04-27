package com.kodilla.good.patterns.challenges;

public class MailService implements MailInformation {

    public void inform(User user, Item item) {
        System.out.println("Hello " + user.getUserName() + " " + user.getUserSurname() + "!");
        System.out.println("You ordered " + item.getItemName() +
                " which costs " + item.getItemPrice() + "$");
    }
}
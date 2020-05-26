package com.kodilla.good.patterns.challenges.zad3;

public class Order {

    private String product;
    private int price;
    private int quantity;
    private  String shop;

    public Order(String product, int price, int quantity, String shop) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.shop = shop;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getShop() {
        return shop;
    }
}
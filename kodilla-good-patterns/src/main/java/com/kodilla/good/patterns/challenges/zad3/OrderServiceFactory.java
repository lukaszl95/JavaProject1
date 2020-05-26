package com.kodilla.good.patterns.challenges.zad3;

public class OrderServiceFactory {
    public static final String EXTRAFOODSHOP = "ES";
    public static final String GLUTENFREESHOP = "GS";
    public static final String HEALTHYSHOP = "HS";

    public static OrderService getOrderService(String orderServiceName) throws Exception {
        if (orderServiceName.toUpperCase().equals(EXTRAFOODSHOP)) {
            return new ExtraFoodShopOrderService();
        } else if (orderServiceName.toUpperCase().equals(GLUTENFREESHOP)) {
            return new GlutenFreeShopOrderService();
        } else if (orderServiceName.toUpperCase().equals(HEALTHYSHOP)) {
            return new HealthyShopOrderService();
        } else {
            throw new Exception("Shop " + orderServiceName + " doesn't exist.");
        }
    }
}
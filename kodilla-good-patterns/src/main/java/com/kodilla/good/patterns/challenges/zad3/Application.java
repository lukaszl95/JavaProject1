package com.kodilla.good.patterns.challenges.zad3;

public class Application {

    public static void main (String[] args) throws Exception {

        OrderRequestRetriever orderRetriever = new OrderRequestRetriever();

        OrderRequest orderExtra = orderRetriever.retrieveExtraShop();
        ProductOrderService productExtra = new ProductOrderService(
                new MailService(), new ExtraFoodShopOrderRepository());
        productExtra.process(orderExtra);

        OrderRequest orderHealthy = orderRetriever.retrieveHealthyShop();
        ProductOrderService productHealthy = new ProductOrderService(
                new MailService(), new ExtraFoodShopOrderRepository());
        productHealthy.process(orderHealthy);

        OrderRequest orderGlutenFree = orderRetriever.retrieveGlutenShop();
        ProductOrderService productGlutenFree = new ProductOrderService(
                new MailService(), new ExtraFoodShopOrderRepository());
        productGlutenFree.process(orderGlutenFree);

    }
}

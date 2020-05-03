package com.kodilla.good.patterns.challenges.zad2;

public class Application {
    public static void main (String[] args) {

        SaleRequestRetriever saleRequestRetriever = new SaleRequestRetriever();
        SaleRequest saleRequest = saleRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new ItemsSaleService(), new ItemsSaleRepository());
        productOrderService.process(saleRequest);
    }
}

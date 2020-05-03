package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private MailInformation mailInformationService;
    private ItemSaleService itemSaleService;
    private ItemSaleRepository itemSaleRepository;

    public ProductOrderService(final MailInformation mailInformationService,
                               final ItemSaleService itemSaleService,
                               final ItemSaleRepository itemSaleRepository) {
        this.mailInformationService = mailInformationService;
        this.itemSaleService = itemSaleService;
        this.itemSaleRepository = itemSaleRepository;
    }

    public Sale process(final SaleRequest saleRequest) {
        boolean isSold = itemSaleService.sale(saleRequest.getUser(), saleRequest.getItem(), saleRequest.getTime());

        if (isSold) {
            itemSaleRepository.createSale(saleRequest.getUser(), saleRequest.getItem(), saleRequest.getTime());
            mailInformationService.inform(saleRequest.getUser(), saleRequest.getItem());
            return new Sale(saleRequest.getUser(), true);
        } else {
            return new Sale(saleRequest.getUser(), false);
        }
    }
}
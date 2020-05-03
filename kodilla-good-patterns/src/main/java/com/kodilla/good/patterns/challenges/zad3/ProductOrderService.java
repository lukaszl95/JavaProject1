package com.kodilla.good.patterns.challenges.zad3;

public class ProductOrderService {

    private MailInformation mailInformation;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final MailInformation informationService,
                               final OrderRepository orderRepository) {
        this.mailInformation = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) throws Exception {
        orderService = OrderServiceFactory.getOrderService(orderRequest.getOrderServiceName());
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrder(), orderRequest.getTime());

        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrder(), orderRequest.getTime());
            mailInformation.inform(orderRequest.getUser(), orderRequest.getOrder());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
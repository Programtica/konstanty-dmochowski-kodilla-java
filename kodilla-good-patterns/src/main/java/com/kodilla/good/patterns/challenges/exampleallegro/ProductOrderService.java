package com.kodilla.good.patterns.challenges.exampleallegro;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createAnOrder(orderRequest);
            System.out.println("Zamówienie dla " + orderRequest.getUser() + " zostało zrealizowane!");
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Pojawiły się jakieś błędy...");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}

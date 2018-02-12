package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class ProducerProcessor {
    private OrderService orderService;
    private boolean orderProcessResult;

    public ProducerProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public void process(List<Order> orders) {
        orderProcessResult = orderService.execute(orders);
    }
    public void result() {
        System.out.println(orderProcessResult ? ResultOfProcess.SUCCESS : ResultOfProcess.FAILURE);
    }
}

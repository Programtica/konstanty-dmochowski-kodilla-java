package com.kodilla.good.patterns.challenges.exampleallegro;

public class Application {
    public static void main(String[] args) {
        User user = new User("kot", "Konstanty", "Dmochowski", "530221345");
        OrderRequest orderRequest = new OrderRequest(user, "FIFA 18");

        ProductOrderService orderService = new ProductOrderService(new SMSMessageService(), new GameOrderService(), new GameOrderRepository());
        orderService.process(orderRequest);
    }
}

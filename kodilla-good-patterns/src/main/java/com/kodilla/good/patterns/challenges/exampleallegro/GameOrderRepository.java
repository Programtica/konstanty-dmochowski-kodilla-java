package com.kodilla.good.patterns.challenges.exampleallegro;

public class GameOrderRepository implements OrderRepository {
    @Override
    public boolean createAnOrder(OrderRequest orderRequest) {
        System.out.println("Zamówienie zostało wysłane do bazy!");
        return true;
    }
}

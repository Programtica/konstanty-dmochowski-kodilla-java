package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private Product product;
    private int quantityOfProduct;

    public Order(Product product, int quantityOfProduct) {
        this.product = product;
        this.quantityOfProduct = quantityOfProduct;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product=" + product +
                ", quantityOfProduct=" + quantityOfProduct +
                '}';
    }
}

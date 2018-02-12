package com.kodilla.good.patterns.challenges.food2door;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRequestRetriever {
    private final Map<String, List<Order>> orderRequests;

    public OrderRequestRetriever() {
        orderRequests = new HashMap<>();

        List<Order> extraFoodOrder =
                Arrays.asList(new Order((new Product("Lody czekoladowe", 9.99)), 1),
                        new Order((new Product("Sok pomarańczowy", 3.99)), 2));

        orderRequests.put(Producer.EXTRA_FOOD_SHOP, extraFoodOrder);

        List<Order> healthyFoodOrder =
                Arrays.asList(new Order((new Product("Chleb żytni", 2.50)), 2),
                        new Order((new Product("Marchew",2)), 4));

        orderRequests.put(Producer.HEALTHY_SHOP, healthyFoodOrder);


        List<Order> glutenFreeShop =
                Arrays.asList(new Order((new Product("Kukurydza", 3.99)), 3),
                        new Order((new Product("Ryż",5.99)), 1));

        orderRequests.put(Producer.GLUTEN_FREE_SHOP, glutenFreeShop);
    }

    public Map<String, List<Order>> retrieve() {
        return orderRequests;
    }
}

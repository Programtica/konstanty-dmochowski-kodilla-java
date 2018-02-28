package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int quantity) {
            this.burgers = quantity;
            return this;
        }

        public BigmacBuilder sauce(SauceEnum sauce) {
            this.sauce = sauce.toString().toLowerCase();
            return this;
        }

        public BigmacBuilder ingredients(IngredientsEnum ingredients) {
            this.ingredients.add(ingredients.toString().toLowerCase());
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    public enum SauceEnum {
        STANDARD, THE1000ISLANDS, BARBECUE;
    }

    public enum IngredientsEnum {
        SALAD, ONION, BACON, CUCUMBER, PEPPERCHILLI, MUSHROOMS, SHRIMPS, CHEESE;
    }

    public Bigmac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}

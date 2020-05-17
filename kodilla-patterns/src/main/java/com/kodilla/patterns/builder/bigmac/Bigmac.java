package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private String bun;
    private int burgers;
    private List<String> sauces;
    private List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private List<String> sauces = new ArrayList<>();
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder setBurgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder setSauces(String sauce) {
            sauces.add(sauce);
            return this;
        }

        public BigmacBuilder setIngredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauces, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, List<String> sauces, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauces = new ArrayList<>(sauces);
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BIGMAC " +
                "bun: '" + bun + '\'' +
                ", burgers: '" + burgers + '\'' +
                ", sauces: " + sauces +
                ", ingredients: " + ingredients;
    }
}
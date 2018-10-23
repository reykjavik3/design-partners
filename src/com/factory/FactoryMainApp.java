package com.factory;

public class FactoryMainApp {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicageStore = new ChicagePizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());
        Pizza cheese = chicageStore.orderPizza("cheese");
        System.out.println(cheese.getName());
    }
}

package com.factory;

public class ChicagePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else{
            return null;
        }
    }
}

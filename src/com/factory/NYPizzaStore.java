package com.factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYstyleCheesePizza();
        }else{
            return null;
        }
    }
}

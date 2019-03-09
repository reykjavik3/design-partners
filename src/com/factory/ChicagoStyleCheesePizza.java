package com.factory;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicage style Deep Dish Cheese Pizza";
        dough = "Extra Thiclk Crust Douhh";
        sauce = "Plum Tomato Saiuce";
        toppings.add("Shredded Mozzarella cheese");
    }
    void cut(){
        System.out.println("Cuttingh the Pizza into square slice");
    }
}

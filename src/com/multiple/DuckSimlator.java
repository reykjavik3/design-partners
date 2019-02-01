package com.multiple;

/**
 * create by murong
 * create in 2019/1/31
 */
public class DuckSimlator {
    public static void main(String[] args) {
        DuckSimlator simlator = new DuckSimlator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simlator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallarDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("Duck Simlator:with Goose Adapter");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}

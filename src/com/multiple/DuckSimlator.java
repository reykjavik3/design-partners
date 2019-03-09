package com.multiple;

import java.util.ServiceLoader;

/**
 * create by murong
 * create in 2019/1/31
 */
public class DuckSimlator {
    public static void main(String[] args) {
        ServiceLoader<Quackable> load = ServiceLoader.load(Quackable.class);
        load.forEach(Quackable::quack);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("Duck Simlator:with Goose Adapter");
        Flock flockDucks = new Flock();
        flockDucks.add(redheadDuck);
        flockDucks.add(duckCall);
        flockDucks.add(rubberDuck);
        flockDucks.add(gooseDuck);
        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallarDuck();
        Quackable mallardTwo = duckFactory.createMallarDuck();
        Quackable mallardThree = duckFactory.createMallarDuck();
        Quackable mallardFour = duckFactory.createMallarDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        flockDucks.add(flockOfMallards);
        simulate(flockDucks);
        simulate(flockOfMallards);

        System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}

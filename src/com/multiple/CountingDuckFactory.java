package com.multiple;

/**
 * create by murong
 * create in 2019/2/1
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallarDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}

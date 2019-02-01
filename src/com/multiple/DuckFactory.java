package com.multiple;

/**
 * create by murong
 * create in 2019/2/1
 */
public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallarDuck() {
        return new MallardDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
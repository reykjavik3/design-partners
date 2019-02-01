package com.multiple;

/**
 * create by murong
 * create in 2019/2/1
 */
public class GooseAdapter implements Quackable{

    Goose goose;

    public void quack() {
        goose.honk();
    }

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }
}

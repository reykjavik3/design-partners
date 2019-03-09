package com.multiple;

import interfacepack.Quack;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * create by murong
 * create in 2019/2/1
 */
public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    public void quack() {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quackable = (Quackable)iterator.next();
            quackable.quack();
        }
    }
}

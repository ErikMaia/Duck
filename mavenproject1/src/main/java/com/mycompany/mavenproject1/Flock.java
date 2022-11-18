package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    Observable observable;
    public Flock() {
        this.observable = new Observable(this);
    }

    ArrayList<Quackable> quarckers = new ArrayList<Quackable>();

    public void add(Quackable quarcker){
        quarckers.add(quarcker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quarckers.iterator();
        while (iterator.hasNext()) {
            Quackable quarcker = iterator.next();
            quarcker.quack();
        }
        
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);;
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
    
}

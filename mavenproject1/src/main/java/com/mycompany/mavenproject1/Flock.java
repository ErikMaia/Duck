package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{

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
    
}

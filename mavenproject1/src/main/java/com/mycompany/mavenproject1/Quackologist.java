package com.mycompany.mavenproject1;

public class Quackologist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: "+ duck +" just quacked");
        
    }
    
}

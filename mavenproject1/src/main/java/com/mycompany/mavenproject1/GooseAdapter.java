package com.mycompany.mavenproject1;

public class GooseAdapter implements Quackable{
    Observable observable;
    private Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
    
}

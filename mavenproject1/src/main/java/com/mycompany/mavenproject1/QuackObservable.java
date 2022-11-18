package com.mycompany.mavenproject1;


public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObserver();
}

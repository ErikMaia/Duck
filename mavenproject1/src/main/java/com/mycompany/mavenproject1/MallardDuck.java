/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

public class MallardDuck implements Quackable {
    Observable observable;
    public MallardDuck() {
        this.observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObserver();
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
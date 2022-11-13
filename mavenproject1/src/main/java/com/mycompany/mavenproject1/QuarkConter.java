/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author erik
 */
public class QuarkConter implements Quackable {
    Quackable duck;
    static int numberOfQuack;
    
    public void QuackConter(Quackable duck){
        this.duck = duck;
    }
    
    
    
    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
    }
    
    public static int getQuacks(){
        return numberOfQuack;
    }
    
}

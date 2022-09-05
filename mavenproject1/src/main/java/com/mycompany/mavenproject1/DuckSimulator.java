/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author erik
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate(){
        Quackable mallard = new MallardDuck();
        Quackable readhead = new ReadheadDuck();
        Quackable duckCall = new DuckCall();
        System.out.println("Duck Simulator");
        simulate(mallard);
        simulate(readhead);
        simulate(duckCall);
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
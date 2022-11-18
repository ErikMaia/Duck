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
        AbstractDuckFactory duckFactory = new  CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallard = duckFactory.CreateMallardDuck();
        Quackable readhead = duckFactory.CreateReadheadDuck();
        Quackable duckCall = duckFactory.CreateDuckCall();
        Quackable rubberDuck = duckFactory.CreateRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());


        System.out.println("Duck Simulator");
        
        simulate(mallard);
        simulate(readhead);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        System.out.println("The ducks quarcked " + QuarkCounter.getQuacks());
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
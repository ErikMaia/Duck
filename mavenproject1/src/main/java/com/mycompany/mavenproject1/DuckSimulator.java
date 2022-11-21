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
        Flock flockOfDucks = new Flock();

        System.out.println("Duck Simulator");
        
        flockOfDucks.add(mallard);
        flockOfDucks.add(readhead);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMalard = new Flock();
        Quackable mallardOne = duckFactory.CreateMallardDuck();
        Quackable mallardTwo = duckFactory.CreateMallardDuck();
        Quackable mallardThree = duckFactory.CreateMallardDuck();
        flockOfMalard.add(mallardOne);
        flockOfMalard.add(mallardTwo);
        flockOfMalard.add(mallardThree);
        flockOfDucks.add(flockOfMalard);

        simulate(flockOfDucks);


        System.out.println("The ducks quarcked " + QuarkCounter.getQuacks());

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
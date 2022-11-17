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
        Flock flockOfDucks = new Flock();

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

        System.out.println("\nDuck Simulator: Whole Flock simultor");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Malard Flock simultor");
        simulate(flockOfMalard);
        System.out.println("\nThe ducks quarcked " + QuarkCounter.getQuacks());
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
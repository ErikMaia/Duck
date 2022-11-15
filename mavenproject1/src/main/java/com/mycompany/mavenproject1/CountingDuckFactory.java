package com.mycompany.mavenproject1;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable CreateMallardDuck() {
        return new QuarkCounter(new MallardDuck());
    }

    @Override
    public Quackable CreateReadheadDuck() {
        return new QuarkCounter(new ReadheadDuck());
    }

    @Override
    public Quackable CreateDuckCall() {
        return new QuarkCounter(new DuckCall());
    }

    @Override
    public Quackable CreateRubberDuck() {
        return new QuarkCounter(new ReadheadDuck());
    }
    
}

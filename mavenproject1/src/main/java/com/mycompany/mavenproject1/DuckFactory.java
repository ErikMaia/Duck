package com.mycompany.mavenproject1;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable CreateMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable CreateReadheadDuck() {
        return new ReadheadDuck();
    }

    @Override
    public Quackable CreateDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable CreateRubberDuck() {
        return new RubberDuck();
    }
    
}

package com.mycompany.mavenproject1;

public class GooseAdapter implements Quackable{

    private Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
    
}

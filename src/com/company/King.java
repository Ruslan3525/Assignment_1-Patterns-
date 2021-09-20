package com.company;

public class King extends Character {
    public King(){
        typeofweapon = new AxeBehavior();
    }
    @Override
    void display() {
        System.out.println("I am King!");
    }
}

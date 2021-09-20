package com.company;

public class Queen extends Character{
    public Queen(){
        typeofweapon = new KnifeBehavior();
    }
    @Override
    void display() {
        System.out.println("I am Queen!");
    }
}

package com.company;

public class Knight extends Character {
    public Knight(){
        typeofweapon = new SwordBehavior();
    }
    @Override
    void display() {
        System.out.println("I am Knight");
    }
}

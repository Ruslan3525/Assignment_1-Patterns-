package com.company;

    public class Troll extends Character{
        public Troll(){
            typeofweapon = new SwordBehavior();
        }
        @Override
        void display() {
            System.out.println("I am Troll!");
        }
    }


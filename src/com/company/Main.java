package com.company;

public class Main {

    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.display();
        queen.fight();
        System.out.println("Change weapon to");
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();
    }
}


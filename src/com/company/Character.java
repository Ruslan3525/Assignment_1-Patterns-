package com.company;

public abstract  class Character {
    WeaponBehavior typeofweapon;
    abstract void display();

    public void fight(){
        typeofweapon.useWeapon();
    }
}
    public void setWeapon(WeaponBehavior typeofweapon) {

        this.typeofweapon = typeofweapon;
    }


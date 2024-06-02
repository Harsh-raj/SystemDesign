package Decorator.AddOns;

import Decorator.Burger;

public class Mayonnaise extends FillerDecorator {

    private Burger burger;

    public Mayonnaise(Burger burger) {
        this.burger = burger;
    }

    public int getPrice(){
        return this.burger.getPrice()+15;
    }

    public void display(){
        this.burger.display();
        System.out.print(" + "+this.getClass().getSimpleName());
    }
}

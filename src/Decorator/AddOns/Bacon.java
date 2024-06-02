package Decorator.AddOns;

import Decorator.Burger;

public class Bacon extends FillerDecorator {

    private Burger burger;

    public Bacon(Burger burger) {
        this.burger = burger;
    }

    public int getPrice(){
        return this.burger.getPrice()+30;
    }

    public void display(){
        this.burger.display();
        System.out.print(" + "+this.getClass().getSimpleName());
    }
}

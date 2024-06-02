package Decorator.AddOns;

import Decorator.Burger;

public class Lettuce extends FillerDecorator{
    private Burger burger;

    public Lettuce(Burger burger) {
        this.burger = burger;
    }

    @Override
    public int getPrice() {
        return this.burger.getPrice()+10;
    }

    public void display(){
        this.burger.display();
        System.out.print(" + "+this.getClass().getSimpleName());
    }

}

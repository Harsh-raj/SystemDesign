package LLD.Decorator.AddOns;

import LLD.Decorator.Burger;

public class CheeseSlice extends FillerDecorator {
    private Burger burger;

    public CheeseSlice(Burger burger) {
        this.burger = burger;
    }

    @Override
    public int getPrice() {
        return this.burger.getPrice()+25;
    }

    public void display(){
        this.burger.display();
        System.out.print(" + "+this.getClass().getSimpleName());
    }
}

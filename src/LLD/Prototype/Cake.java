package LLD.Prototype;

public class Cake implements Prototype{
    String flavour;
    String toppings;
    String decoration;

    public Cake(String flavour, String topping, String decoration){
        this.flavour = flavour;
        this.toppings = topping;
        this.decoration = decoration;
    }

    @Override
    public Cake clone_() {
        return new Cake(flavour, toppings, decoration);
    }
}

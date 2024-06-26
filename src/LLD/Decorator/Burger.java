package LLD.Decorator;

public class Burger extends Meal{
    private String name;

    private int price;

    public Burger() {
        this.name = "Burger";
        this.setPrice(20);
    }

    @Override
    public void display() {
        System.out.print("Name: "+this.getName());
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }
}

package LLD.Factory;

public class Circle implements Shape{

    public int r;
    @Override
    public void computeArea() {
        System.out.println("Area of circle = "+2*3.14*r);
    }

}

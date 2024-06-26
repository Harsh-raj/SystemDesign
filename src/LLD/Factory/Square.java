package LLD.Factory;

public class Square implements Shape{
    float side;

    @Override
    public void computeArea() {
        System.out.println("Area of Square = "+side*side);
    }
}

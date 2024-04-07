package Factory;

public class Rectangle implements Shape{
    float length;
    float breadth;
    @Override
    public void computeArea() {
        System.out.println("Area of Rectangle = "+length*breadth);
    }
}

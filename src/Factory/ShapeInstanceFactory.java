package Factory;

public class ShapeInstanceFactory {
    public Shape getShapeInstance(String shapeType){
        if(shapeType.equals("Circle")){
            return new Circle();
        }else if(shapeType.equals("Rectangle")){
            return new Rectangle();
        }else if(shapeType.equals("Square")){
            return new Square();
        }else if(shapeType.equals("Rhombus")){ // any changes for the user requirements can be dealt in this class
            return new Square();
        }
        return null;
    }
}

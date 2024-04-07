package AbstractFactory;

public class EconomicCarFactory implements AbstractFactory{
    public Car getCarInstance(int price){
        if(price<1000000){
            return new HatchBack();
        }else{
            return new Sedan();
        }
    }
}

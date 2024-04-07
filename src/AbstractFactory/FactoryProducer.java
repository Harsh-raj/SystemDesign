package AbstractFactory;

public class FactoryProducer {
    public AbstractFactory getCarType(String carType){
        if(carType.equals("Premium")){
            return new PremiumCarFactory();
        }else if(carType.equals("Economic")){
            return new EconomicCarFactory();
        }
        return null;
    }
}

package LLD.AbstractFactory;

public class PremiumCarFactory implements AbstractFactory {
    public Car getCarInstance(int price){
        if(price<10000000){
            return new PremiumSedan();
        }else{
            return new Limosine();
        }
    }
}

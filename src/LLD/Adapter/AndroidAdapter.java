package LLD.Adapter;

public class AndroidAdapter implements IPhoneCharger{

    @Override
    public void chargePhone() {
        System.out.println("Your IPhone15 is charging using LLD.AbstractFactory.Adapter... \uD83E\uDDE0");
    }
}

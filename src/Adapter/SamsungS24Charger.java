package Adapter;

public class SamsungS24Charger implements AndroidCharger{

    @Override
    public void chargePhone() {
        System.out.println("Your SamsungS24 is charging... \uD83D\uDE00");
    }
}

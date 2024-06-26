package LLD.Adapter;

public class SamsungS24 {
    private SamsungS24Charger s24Charger;

    public SamsungS24(SamsungS24Charger s24Charger) {
        this.s24Charger = s24Charger;
    }

    public void chargeSamsungS24(){
        s24Charger.chargePhone();
    }
}

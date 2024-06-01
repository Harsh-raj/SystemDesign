package Adapter;

public class IPhone15 {
    private IPhoneCharger iPhoneCharger;

    public IPhone15(IPhoneCharger iPhoneCharger) {
        this.iPhoneCharger = iPhoneCharger;
    }

    public void chargeIPhone(){
        iPhoneCharger.chargePhone();
    }
}

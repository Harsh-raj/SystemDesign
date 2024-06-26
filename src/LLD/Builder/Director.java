package LLD.Builder;

public class Director {
    public SmartPhoneBuilder smartPhoneBuilder;
    public Director(SmartPhoneBuilder smartPhoneBuilder){
        this.smartPhoneBuilder = smartPhoneBuilder;
    }

    public SmartPhone createSmartPhoneBuilder(SmartPhoneBuilder smartPhoneBuilder){
        if(smartPhoneBuilder instanceof SamsungSmartPhone){
            return createSamsungSmartPhone();
        }
        else if(smartPhoneBuilder instanceof AppleSmartPhone){
            return createAppleSmartPhone();
        }
        return null;
    }

    public SmartPhone createAppleSmartPhone() {
        return smartPhoneBuilder.setRAM(8).setInternalMemory(256).setBatteryCapacity(5000).setProcessorFreq(3).setDualSim(false).setFullHD(true).setScreenHeight(6).setCompany("Apple").build();
    }

    public SmartPhone createSamsungSmartPhone(){
        return smartPhoneBuilder.setRAM(8).setInternalMemory(128).setBatteryCapacity(5000).setProcessorFreq(2.1F).setScreenHeight(5.6F).setFullHD(true).setDualSim(true).setCompany("Samsung").build();
    }
}

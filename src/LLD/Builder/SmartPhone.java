package LLD.Builder;

public class SmartPhone{

    private int RAM;
    private int internalMemory;
    private int batteryCapacity;
    private float screenHeight;
    private boolean fullHD;
    private boolean dualSim;
    private float processorFreq;

    private String company;

    @Override
    public String toString() {
        return "SmartPhone{" +
                "RAM=" + RAM +
                ", internalMemory=" + internalMemory +
                ", batteryCapacity=" + batteryCapacity +
                ", screenHeight=" + screenHeight +
                ", fullHD=" + fullHD +
                ", dualSim=" + dualSim +
                ", processorFreq=" + processorFreq +
                ", company='" + company + '\'' +
                '}';
    }

    public SmartPhone(SmartPhoneBuilder smartPhoneBuilder) {
        this.batteryCapacity = smartPhoneBuilder.getBatteryCapacity();
        this.dualSim = smartPhoneBuilder.isDualSim();
        this.fullHD = smartPhoneBuilder.isFullHD();
        this.RAM = smartPhoneBuilder.getRAM();
        this.internalMemory = smartPhoneBuilder.getInternalMemory();
        this.screenHeight = smartPhoneBuilder.getScreenHeight();
        this.processorFreq = smartPhoneBuilder.getProcessorFreq();
        this.company = smartPhoneBuilder.getCompany();
    }
}
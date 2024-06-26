package LLD.Builder;

public abstract class SmartPhoneBuilder {
        private int RAM;
        private int internalMemory;
        private int batteryCapacity;
        private float screenHeight;
        private boolean fullHD;
        private boolean dualSim;
        private float processorFreq;
        public String company;

    public int getRAM() {
        return RAM;
    }

    public int getInternalMemory() {
        return internalMemory;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public float getScreenHeight() {
        return screenHeight;
    }

    public boolean isFullHD() {
        return fullHD;
    }

    public boolean isDualSim() {
        return dualSim;
    }

    public float getProcessorFreq() {
        return processorFreq;
    }

    public String getCompany(){
        return company;
    }

    public SmartPhoneBuilder setRAM(int RAM){
        this.RAM=RAM;
        return this;
    }

    public SmartPhoneBuilder setInternalMemory(int internalMemory){
        this.internalMemory=internalMemory;
        return this;
    }

    public SmartPhoneBuilder setBatteryCapacity(int batteryCapacity){
        this.batteryCapacity=batteryCapacity;
        return this;
    }

    public SmartPhoneBuilder setScreenHeight(float screenHeight) {
        this.screenHeight = screenHeight;
        return this;
    }

    public SmartPhoneBuilder setFullHD(boolean fullHD) {
        this.fullHD = fullHD;
        return this;
    }

    public SmartPhoneBuilder setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
        return this;
    }

    public SmartPhoneBuilder setProcessorFreq(float freq) {
        this.processorFreq = freq;
        return this;
    }

    abstract public SmartPhoneBuilder setCompany(String company);

    public SmartPhone build(){
        return new SmartPhone(this);
    }

    //public abstract String toString_();
}

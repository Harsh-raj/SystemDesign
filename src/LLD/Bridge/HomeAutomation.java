package LLD.Bridge;

public abstract class HomeAutomation {
    public AutomateFeature automateFeature;

    public HomeAutomation(AutomateFeature automateFeature){
        this.automateFeature = automateFeature;
    }

    abstract public void use();
}

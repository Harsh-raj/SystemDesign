package Bridge;

public class Temperature extends HomeAutomation{
    public Temperature(AutomateFeature automateFeature){
        super(automateFeature);
    }

    public void use(){
        automateFeature.useImpl();
    }

}

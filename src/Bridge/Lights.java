package Bridge;

public class Lights extends HomeAutomation{

    public Lights(AutomateFeature automateFeature) {
        super(automateFeature);
    }

    @Override
    public void use() {
        automateFeature.useImpl();
    }

}

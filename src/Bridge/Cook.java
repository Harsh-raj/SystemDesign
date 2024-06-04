package Bridge;

public class Cook extends HomeAutomation{
    public Cook(AutomateFeature automateFeature){
        super(automateFeature);
    }

    @Override
    public void use() {
        automateFeature.useImpl();
    }
}

package Bridge;

public class UseLights extends AutomateFeature {
    boolean onState;

    public UseLights() {
        onState = false;
    }

    void useImpl() {
        if (onState) {
            System.out.println("Home Automation has turned off lights");
            onState = false;
        } else {
            System.out.println("Home Automation has turned on lights");
            onState = true;
        }
    }
}
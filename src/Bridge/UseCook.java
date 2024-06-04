package Bridge;

public class UseCook extends AutomateFeature{
    boolean isCooking;

    public UseCook() {
        isCooking = false;
    }

    void useImpl() {
        if (isCooking) {
            System.out.println("Home Automation stopped cooking food now...");
            isCooking = false;
        }else{
            System.out.println("Home Automation started cooking food now.");
            isCooking = true;
        }
    }
}

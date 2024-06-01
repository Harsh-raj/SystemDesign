package Strategy;

import Strategy.CustomPlan.CustomDataPlan;

public class Plan {

    private CustomDataPlan customDataPlan;

    public Plan(CustomDataPlan customDataPlan) {
        this.customDataPlan = customDataPlan;
    }

    public void recharge(){
        this.customDataPlan.plan();
    }
}

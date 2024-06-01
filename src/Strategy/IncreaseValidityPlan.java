package Strategy;

import Strategy.CustomPlan.CustomDataPlan;
import Strategy.CustomPlan.ValidityPlan;

public class IncreaseValidityPlan extends Plan{

    public IncreaseValidityPlan() {
        super(new ValidityPlan());
    }
}

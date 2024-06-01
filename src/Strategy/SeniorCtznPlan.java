package Strategy;

import Strategy.CustomPlan.CustomDataPlan;
import Strategy.CustomPlan.TalkTimePlan;

public class SeniorCtznPlan extends Plan{

    public SeniorCtznPlan() {
        super(new TalkTimePlan());
    }
}

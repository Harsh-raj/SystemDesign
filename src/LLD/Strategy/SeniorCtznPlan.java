package LLD.Strategy;

import LLD.Strategy.CustomPlan.TalkTimePlan;

public class SeniorCtznPlan extends Plan{

    public SeniorCtznPlan() {
        super(new TalkTimePlan());
    }
}

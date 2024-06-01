package Strategy;

import Strategy.CustomPlan.DataPlan;

public class StudentPlan extends Plan{
    public StudentPlan() {
        super(new DataPlan());
    }
}

package LLD.Strategy;

import LLD.Strategy.CustomPlan.DataPlan;

public class StudentPlan extends Plan{
    public StudentPlan() {
        super(new DataPlan());
    }
}

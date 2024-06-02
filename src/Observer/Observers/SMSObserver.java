package Observer.Observers;

public class SMSObserver implements VacancyAlertObserver{
    private String mobno;

    public SMSObserver(String mobno) {
        this.mobno = mobno;
    }

    public String getMobno() {
        return mobno;
    }

    @Override
    public void update() {
        System.out.println("Job Vacancy alert on SMS");
    }
}

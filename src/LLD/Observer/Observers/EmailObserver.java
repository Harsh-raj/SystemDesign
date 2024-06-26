package LLD.Observer.Observers;

public class EmailObserver implements VacancyAlertObserver{
    private String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void update() {
        System.out.println("Job Vacancy alert at Email");
    }
}

package Observer.Observers;

public class WebSiteObserver implements VacancyAlertObserver{
    @Override
    public void update() {
        System.out.println("Job Vacancy alert provided at website");
    }
}

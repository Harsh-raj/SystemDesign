package LLD.Observer.Observable;

import LLD.Observer.Observers.VacancyAlertObserver;

public interface JobVacancyObservable {
    void add(VacancyAlertObserver vacancyAlertObserver);

    void remove(VacancyAlertObserver vacancyAlertObserver);
    void notifyObservers();
    void setJobOpenings(int numVacancies);

    int getJobOpenings();
}

package LLD.Observer.Observable;

import LLD.Observer.Observers.EmailObserver;
import LLD.Observer.Observers.SMSObserver;
import LLD.Observer.Observers.VacancyAlertObserver;
import LLD.Observer.Observers.WebSiteObserver;

import java.util.ArrayList;

public class ITJobObservable implements JobVacancyObservable{

    private ArrayList<VacancyAlertObserver> observerArrayList = new ArrayList<VacancyAlertObserver>();

    private int numOpenings=0;
    @Override
    public void add(VacancyAlertObserver vacancyAlertObserver) {
        observerArrayList.add(vacancyAlertObserver);
    }

    @Override
    public void remove(VacancyAlertObserver vacancyAlertObserver) {
        observerArrayList.remove(vacancyAlertObserver);
    }

    @Override
    public void notifyObservers() {
        for(VacancyAlertObserver observer : observerArrayList){
            if(observer instanceof EmailObserver emailObserver){
                System.out.println("From: Vacancyalert@jobbot.com\nTo: "+emailObserver.getEmail()+"\nHi, "+this.getJobOpenings()+" IT Job Opening for you!\n");
            }else if(observer instanceof SMSObserver smsObserver){
                System.out.println("Sender: Vacancyalert@jobbot\nRecieved on: "+smsObserver.getMobno()+"\nHi, "+this.getJobOpenings()+" IT Job Opening for you!\n");
            }else if(observer instanceof WebSiteObserver webSiteObserver){
                System.out.println("Whats New: "+this.getJobOpenings()+" IT Job Openings available\n\n");
            }
        }
    }

    @Override
    public void setJobOpenings(int numOpenings) {
        if(this.numOpenings == 0){
            this.numOpenings += numOpenings;
            this.notifyObservers();
        }else this.numOpenings += numOpenings;
    }

    @Override
    public int getJobOpenings() {
        return this.numOpenings;
    }
}

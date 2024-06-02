// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Adapter.*;
import Builder.AppleSmartPhone;
import Builder.Director;
import Builder.SamsungSmartPhone;
import Builder.SmartPhone;
import Decorator.AddOns.*;
import Decorator.Burger;
import Decorator.Meal;
import Iterator.CustomIterator;
import Iterator.User;
import Iterator.UserIterator;
import Iterator.UserManagement;
import Observer.Observable.GovtJobObservable;
import Observer.Observable.ITJobObservable;
import Observer.Observable.TeachingJobObservable;
import Observer.Observers.EmailObserver;
import Observer.Observers.SMSObserver;
import Observer.Observers.WebSiteObserver;
import Prototype.Cake;
import SOLID.LiskovSubstitution.Post;
import SOLID.LiskovSubstitution.Reel;
import SOLID.OpenClosePrinciple.EMAIL;
import SOLID.OpenClosePrinciple.SMS;
import SOLID.OpenClosePrinciple.SendMessage;
import SOLID.OpenClosePrinciple.VoiceMail;
import SOLID.SingleResponsibility.Book;
import SOLID.SingleResponsibility.Invoice;
import SOLID.SingleResponsibility.PrintInvoice;
import SOLID.SingleResponsibility.SaveToDB;
import Strategy.CustomPlan.DataPlan;
import Strategy.CustomPlan.ValidityPlan;
import Strategy.IncreaseValidityPlan;
import Strategy.Plan;
import Strategy.SeniorCtznPlan;
import Strategy.StudentPlan;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        // Press Opt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.print("Hello and welcome!");
//
//        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);
//
//
//        }
        /**
         * Prototype implementation
         **/
//        Cake BlackForest = new Cake("Chocolate", "Cherry", "ChocoChips");
//        Cake anotherBlackForest = BlackForest.clone_();
//        System.out.println(BlackForest);
//        System.out.println(anotherBlackForest);

        /**
         * Eager implementation
         */

        /**
         * Abstract Factory
         */
//        AbstractFactory newCar = new FactoryProducer().getCarType("Economic");
//        newCar.getCarInstance(100000).print();

        /**
         * Builder
         */
//        Director applePhoneDirector = new Director(new AppleSmartPhone());
//        Director samsungPhoneDirector = new Director(new SamsungSmartPhone());
//
//        SmartPhone applePhone = applePhoneDirector.createSmartPhoneBuilder(applePhoneDirector.smartPhoneBuilder);
//        SmartPhone samsungPhone = samsungPhoneDirector.createSmartPhoneBuilder(samsungPhoneDirector.smartPhoneBuilder);
//
//        System.out.println(applePhone.toString());
//        System.out.println(samsungPhone.toString());

        /**
         * Single responsibility
         */
//        Book book = new Book(100, "Hounds of Baskerville", 250, 1999);
//        Invoice invoice = new Invoice(book, 2);
//        new SaveToDB(invoice);
//        new PrintInvoice(invoice);

        /**
         * Open/Close Principle
         */
//        new SMS().send();
//        new VoiceMail().send();
//        new EMAIL().send();

        /**
         * Liskov Substitution Principle
         */


//        Post post = new Post();
//        Reel reel = new Reel();

//        UserManagement userManagement = new UserManagement();
//        userManagement.addUser(new User("HARSH", 1));
//        userManagement.addUser(new User("RAJ", 2));
//        userManagement.addUser(new User("SUSHANT", 3));
//
//        CustomIterator i = userManagement.getIterator();
//        while(i.hasnext()) {
//            User curUser = (User)i.next();
//            System.out.println(curUser.getUserName());
//        }

//        IPhone15Charger iPhone15Charger = new IPhone15Charger();
//        IPhone15 iphone15 = new IPhone15(iPhone15Charger);
//        iphone15.chargeIPhone();
//
//        SamsungS24Charger s24Charger = new SamsungS24Charger();
//        SamsungS24 samsungS24 = new SamsungS24(s24Charger);
//        samsungS24.chargeSamsungS24();
//
//        IPhoneCharger adapterCharger = new AndroidAdapter();
//        IPhone15 iPhone15_1 = new IPhone15(adapterCharger);
//        iPhone15_1.chargeIPhone();

//        StudentPlan studentPlan = new StudentPlan();
//        studentPlan.recharge();
//        SeniorCtznPlan seniorplan = new SeniorCtznPlan();
//        seniorplan.recharge();
//        IncreaseValidityPlan validityPlan = new IncreaseValidityPlan();
//        validityPlan.recharge();

//        GovtJobObservable govtJobObservable = new GovtJobObservable();
//        ITJobObservable itJobObservable = new ITJobObservable();
//        TeachingJobObservable teachingJobObservable = new TeachingJobObservable();
//
//        govtJobObservable.add(new EmailObserver("rajharsh209@gmail.com"));
//        govtJobObservable.add(new SMSObserver("9902233412"));
//        govtJobObservable.add(new WebSiteObserver());
//        itJobObservable.add(new EmailObserver("2022csm1004@college.com"));
//        itJobObservable.add(new WebSiteObserver());
//        teachingJobObservable.add(new WebSiteObserver());
//
//        govtJobObservable.setJobOpenings(10);
//        itJobObservable.setJobOpenings(3);
//        teachingJobObservable.setJobOpenings(5);

        Burger burger = new Bacon(new Mayonnaise(new Lettuce(new CheeseSlice(new Burger()))));
        burger.display();
        System.out.println("\nPrice of the Burger: "+burger.getPrice());
    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Builder.AppleSmartPhone;
import Builder.Director;
import Builder.SamsungSmartPhone;
import Builder.SmartPhone;
import Prototype.Cake;

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
        Director applePhoneDirector = new Director(new AppleSmartPhone());
        Director samsungPhoneDirector = new Director(new SamsungSmartPhone());

        SmartPhone applePhone = applePhoneDirector.createSmartPhoneBuilder(applePhoneDirector.smartPhoneBuilder);
        SmartPhone samsungPhone = samsungPhoneDirector.createSmartPhoneBuilder(samsungPhoneDirector.smartPhoneBuilder);

        System.out.println(applePhone.toString());
        System.out.println(samsungPhone.toString());
    }
}
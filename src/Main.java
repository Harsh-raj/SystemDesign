// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Command.*;
import FlyWeight.RolePlayingGame.*;
import FlyWeight.WordProcessor.ILetter;
import FlyWeight.WordProcessor.LetterFactor;
import Mediator.Auction;
import Mediator.Bidder;
import State.PrintOnline.PrintWorks;
import State.PrintOnline.States.PrinterStates;
import State.PrintOnline.Token;
import State.VendingMachine.Coin;
import State.VendingMachine.States.VendingState;
import State.VendingMachine.VendingMachine;

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

//        Burger burger = new Bacon(new Mayonnaise(new Lettuce(new CheeseSlice(new Burger()))));
//        burger.display();
//        System.out.println("\nPrice of the Burger: "+burger.getPrice());

//        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
//        logger.log(Logger.ERROR, "EXCEPTION CAUGHT");
//        logger.log(Logger.DEBUG, "DEBUG REQUIRED");
//        logger.log(Logger.INFO, "INFO PROVIDED");
//
//        Login login = new StudentLogin(new TeacherLogin(new AdminLogin(null)));
//        login.log(Login.STUDENT, "harsh_1004");
//        login.log(Login.TEACHER, "Dr.harsh_1004");
//        login.log(Login.ADMIN, "admin");

//        Directory FTP = new Directory("Movies");
//        FTP.add(new Directory("Comedy").add(new File("Hangover")).add(new File("Ace Venturas")));
//        FTP.add(new Directory("Action").add(new File("The Outlaw")).add(new File("RoadHouse")).add(new File("Never back down")));
//        FTP.add(new Directory("BioPic").add(new File("Wolf of wall street")).add(new File("The man who knew infinity")).add(new File("Narcos")));
//        FTP.add(new Directory("Horror").add(new File("IT")).add(new File("Incidious")).add(new File("Conjuring")));
//
//        FTP.add(new File("Salt"));
//        FTP.add(new File("Salt2"));
//        FTP.ls();

//        Expression e = new Expression( new Number(288), Operation.DIVIDE, new Expression(new Number(4), Operation.MULTIPLY, new Expression(new Number(9), Operation.PLUS, new Number(9)))); //change the order of creation of expression to get correct answer
//        e.display();
//        System.out.println(" = "+e.evaluate());

//        ECommerceFacade eCommerceFacade = new ECommerceFacade(new OrderService(), new PaymentService(), new ShipService(), new NotificationService());
//        eCommerceFacade.placeOrder("Books");

//        Cook cook = new Cook(new UseCook());
//        cook.use();
//        Temperature temperature = new Temperature(new UseTemperature());
//        temperature.use();
//        Lights lights = new Lights(new UseLights());
//        lights.use();
//        cook.use();
//        temperature.use();
//        lights.use();

//        new UGStudent(new HostleFeesVisitor()).pay();
//        new UGStudent(new MessFeesVisitor()).pay();
//        new PHDStudent(new TuitionFeesVisitor()).pay();
//        new PHDStudent(new HostleFeesVisitor()).pay();
//        new PGStudent(new TuitionFeesVisitor()).pay();
//        new PGStudent(new MessFeesVisitor()).pay();

//        ChatGroupMember chatGroupMember1 = new ChatGroupProxy(new Admin());
//        chatGroupMember1.post();
//        chatGroupMember1.react();
//        chatGroupMember1.poll();
//        chatGroupMember1.delete();
//        ChatGroupMember chatGroupMember2 = new ChatGroupProxy(new Member());
//        chatGroupMember2.post();
//        chatGroupMember2.react();
//        chatGroupMember2.poll();
//        chatGroupMember2.delete();
//        new ChatGroupProxy(new Admin() {
//            @Override
//            public void post() {
//                throw new RuntimeException();
//            }
//
//            @Override
//            public void react() {
//                throw new RuntimeException();
//            }
//
//            @Override
//            public void poll() {
//                throw new RuntimeException();
//            }
//
//            @Override
//            public void delete() {
//                throw new RuntimeException();
//            }
//        }).delete(0);

//        new Quiz(EnumSet.of(Options.A, Options.D)).start(NullOption.INSTANCE);
//        new Quiz(EnumSet.of(Options.A, Options.C)).start(EnumSet.of(Options.A, Options.C));
//        new Quiz(EnumSet.of(Options.A, Options.C)).start(EnumSet.of(Options.A, Options.B));
//        new Quiz(EnumSet.of(Options.B, Options.C)).start();

//        VendingMachine vendingMachine = new VendingMachine();
//        try {
//
//            System.out.println("|");
//            System.out.println("filling up the inventory");
//            System.out.println("|");
//
//            VendingMachine.fillUpInventory(vendingMachine);
//            VendingMachine.displayInventory(vendingMachine);
//
//            System.out.println("|");
//            System.out.println("clicking on InsertCoinButton");
//            System.out.println("|");
//
//            VendingState vendingState = vendingMachine.getVendingMachineState();
//            vendingState.clickOnInsertCoinButton(vendingMachine);
//
//            vendingState = vendingMachine.getVendingMachineState();
//            vendingState.insertCoin(vendingMachine, Coin.NICKEL);
//            vendingState.insertCoin(vendingMachine, Coin.QUARTER);
//            // vendingState.insertCoin(vendingMachine, Coin.NICKEL);
//
//            System.out.println("|");
//            System.out.println("clicking on ProductSelectionButton");
//            System.out.println("|");
//            vendingState.clickOnStartProductSelectionButton(vendingMachine);
//
//            vendingState = vendingMachine.getVendingMachineState();
//            vendingState.chooseProduct(vendingMachine, 102);
//
//            VendingMachine.displayInventory(vendingMachine);
//        }
//        catch (Exception e){
//            VendingMachine.displayInventory(vendingMachine);
//        }

//        PrintWorks printWorks = new PrintWorks();
//        try {
//
//            System.out.println("|");
//            System.out.println("filling up the Printer Batch");
//            System.out.println("|");
//
//            PrintWorks.fillUpInventory(printWorks);
//            PrintWorks.displayInventory(printWorks);
//
//            System.out.println("|");
//            System.out.println("clicking on InsertTokenButton");
//            System.out.println("|");
//
//            PrinterStates printerStates = printWorks.getPrinterState();
//            printerStates.clickOnInsertTokenButton(printWorks);
//
//            printerStates = printWorks.getPrinterState();
//            printerStates.insertToken(printWorks, Token.FIVE);
//            printerStates.insertToken(printWorks, Token.TEN);
//
//            System.out.println("|");
//            System.out.println("clicking on PrinterSpaceSelectionButton");
//            System.out.println("|");
//            printerStates.clickOnStartPrinterSelectionButton(printWorks);
//
//            printerStates = printWorks.getPrinterState();
//            printerStates.choosePrinter(printWorks, 104);
//
//            PrintWorks.displayInventory(printWorks);
//        }
//        catch (Exception e){
//            PrintWorks.displayInventory(printWorks);
//        }

//        PlayerTeam playerSAS1 = TeamBarracks.createPlayer("SAS");
//        assert playerSAS1 != null;
//        playerSAS1.display(0, 10);
//
//        PlayerTeam playerSPETSNAZ1 = TeamBarracks.createPlayer("SPETSNAZ");
//        assert playerSPETSNAZ1 != null;
//        playerSPETSNAZ1.display(100, 10);
//
//        PlayerTeam playerSAS2 = TeamBarracks.createPlayer("SAS");
//        assert playerSAS2 != null;
//        playerSAS2.display(0, 20);
//
//        PlayerTeam playerSPETSNAZ = TeamBarracks.createPlayer("SPETSNAZ");
//        assert playerSPETSNAZ != null;
//        playerSPETSNAZ.display(100, 20);
//
//        ILetter object1 = LetterFactor.crateLetter('t');
//        object1.display(0,0);
//
//        ILetter object2 = LetterFactor.crateLetter('t');
//        object2.display(0,6);

//        DronePrototype dronePrototype = new DronePrototype();
//        Controller controller = new Controller();
//
//        controller.setCommand(new DroneFlyUpCommand(dronePrototype))
//                .setCommand(new DroneFlyDownCommand(dronePrototype))
//                .setCommand(new DroneMoveForward(dronePrototype))
//                .setCommand(new DroneMoveBackward(dronePrototype))
//                .setCommand(new DroneDirectionCommand(dronePrototype))
//                .setCommand(new DroneStayStable(dronePrototype));
//
//        controller.pressButton(0);
//        controller.pressButton(5);
//        controller.pressButton(4);
//        controller.pressButton(2);
//        controller.pressButton(5);
//        controller.pressButton(1);

        Auction auction = new Auction();
        auction.addBidder(new Bidder("A", auction)).addBidder(new Bidder("B", auction)).addBidder(new Bidder("C", auction));
        auction.placeBid(auction.getBidder("A"), 100);
        auction.placeBid(auction.getBidder("B"), 110);
        auction.placeBid(auction.getBidder("C"), 150);
        auction.placeBid(auction.getBidder("A"), 160);
        auction.placeBid(auction.getBidder("B"), 180);
        auction.placeBid(auction.getBidder("A"), 200);
        auction.placeBid(auction.getBidder("C"), 250);
        auction.placeBid(auction.getBidder("A"), -1);
        auction.placeBid(auction.getBidder("B"), -1);
    }
}
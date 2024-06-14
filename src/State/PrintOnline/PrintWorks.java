package State.PrintOnline;

import State.PrintOnline.States.PrinterStates;
import State.PrintOnline.States.impl.IdlePrinterState;

import java.util.ArrayList;
import java.util.List;

public class PrintWorks {
    private int files;
    private PrinterStates printerState;
    private PrinterBatch printerBatch;
    private List<Token> tokenList;

    public int getFiles() {
        return files;
    }

    public void setFiles(int files) {
        this.files = files;
    }

    public PrintWorks() {
        System.out.println("********Welcome*******\nPlease Insert tokens then choose a printer and upload files to be printed.\nOn successful processing of your order payment, it would be delivered to you.");
        printerState = new IdlePrinterState();
        printerBatch = new PrinterBatch(10);
        tokenList = new ArrayList<>();
        files = 2;
    }

    public PrinterStates getPrinterState() {
        return printerState;
    }

    public void setPrinterState(PrinterStates printerState) {
        this.printerState = printerState;
    }

    public PrinterBatch getPrinterBatch() {
        return printerBatch;
    }

    public void setPrinterBatch(PrinterBatch printerBatch) {
        this.printerBatch = printerBatch;
    }

    public List<Token> getTokenList() {
        return tokenList;
    }

    public void setTokenList(List<Token> coinList) {
        this.tokenList = coinList;
    }

    public static void fillUpInventory(PrintWorks printWorks){
        PrinterSpace[] spaces = printWorks.getPrinterBatch().getPrinterSpace();

        for (int i = 0; i < spaces.length; i++) {
            Printer newPrinter = new Printer();
            if(i<3) {
                newPrinter.setPrinterType(PrinterType.LASERBW);
                newPrinter.setPrintPrice(2);
            }else if(i<5){
                newPrinter.setPrinterType(PrinterType.LASERCOLOR);
                newPrinter.setPrintPrice(5);
            }else if(i<7){
                newPrinter.setPrinterType(PrinterType.INKJETCOLOR);
                newPrinter.setPrintPrice(10);
            }else if(i<10){
                newPrinter.setPrinterType(PrinterType.PHOTOPRINTER);
                newPrinter.setPrintPrice(25);
            }
            spaces[i].setPrinter(newPrinter);
            spaces[i].setInUse(false);
        }
    }

    public static void displayInventory(PrintWorks printWorks){

        PrinterSpace[] spaces = printWorks.getPrinterBatch().getPrinterSpace();

        for (PrinterSpace space : spaces) {

            System.out.println("CodeNumber: " + space.getCode() +
                    " Item: " + space.getPrinter().getPrinterType().name() +
                    " Price: " + space.getPrinter().getPrintPrice() +
                    " isAvailable: " + !space.isInUse());
        }
    }
}

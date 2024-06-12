package State.PrintOnline.States.impl;

import State.PrintOnline.PrintWorks;
import State.PrintOnline.Printer;
import State.PrintOnline.States.PrinterStates;
import State.PrintOnline.Token;

import java.util.List;

public class SelectionPrinterState implements PrinterStates {


    public SelectionPrinterState() {
        System.out.println("|\nCurrently PrintWorks is in SelectionState\n|");
    }

    @Override
    public void clickOnInsertTokenButton(PrintWorks printWorks) throws Exception {
        throw new Exception("you can not click on insert token button in Selection state");
    }

    @Override
    public void clickOnStartPrinterSelectionButton(PrintWorks printWorks) {
        return;
    }

    @Override
    public void insertToken(PrintWorks printWorks, Token token) throws Exception {
        throw new Exception("you can not insert token in selection state");
    }

    @Override
    public void choosePrinter(PrintWorks printWorks, int codeNumber) throws Exception {
        //1. get item of this codeNumber
        Printer printer = printWorks.getPrinterBatch().findPrinterSpace(codeNumber).getPrinter();

        //2. total amount paid by User
        int paidByUser = 0;
        for(Token token : printWorks.getTokenList()){
            paidByUser = paidByUser + token.value;
        }

        //3. compare product price and amount paid by user
        if(paidByUser < printer.getPrintPrice()*printWorks.getFiles()) {
            System.out.println("Insufficient Amount, Printer you selected is for price: " + printer.getPrintPrice() + " and you paid: " + paidByUser);
            refundFullMoney(printWorks);
            throw new Exception("insufficient amount");
        }
        else if(paidByUser >= printer.getPrintPrice()* printWorks.getFiles()) {
            System.out.println(printer.getPrinterType()+" Printer ("+codeNumber+") is assigned");
            printWorks.getPrinterBatch().findPrinterSpace(codeNumber).setInUse(true);
            PrintWorks.displayInventory(printWorks);

            if(paidByUser > printer.getPrintPrice()*printWorks.getFiles()) {
                getChange(paidByUser-printer.getPrintPrice()*printWorks.getFiles());
            }
            System.out.println("Your order is processed and files are ready for printing.");
            printer.print(printWorks.getFiles());
            printWorks.setPrinterState(new DispatchPrintOrder(printWorks, codeNumber));
        }
    }

    @Override
    public int getChange(int returnExtraChangeMoney) throws Exception {
        //actual logic should be to return COINs in the dispense tray, but for simplicity I am just returning the amount to be refunded
        System.out.println("Returned the change in the Money Dispense Tray: Rs." + returnExtraChangeMoney);
        return returnExtraChangeMoney;
    }

    @Override
    public void finalizeOrder(PrintWorks printWorks, int codeNumber) throws Exception {
        throw new Exception("can not finalize order in Selection state");
    }

    @Override
    public List<Token> refundFullMoney(PrintWorks printWorks) throws Exception {
        System.out.println("Returned the full amount back in the Money Dispense Tray");
        printWorks.setPrinterState(new IdlePrinterState(printWorks));
        return printWorks.getTokenList();
    }

    @Override
    public void updatePrinterBatch(PrintWorks printWorks, Printer printer, int codeNumber) throws Exception {
        throw new Exception("Printer Batch can not be updated in Selection state");
    }
}

package LLD.State.PrintOnline.States.impl;

import LLD.State.PrintOnline.PrintWorks;
import LLD.State.PrintOnline.Printer;
import LLD.State.PrintOnline.States.PrinterStates;
import LLD.State.PrintOnline.Token;

import java.util.List;

public class HasTokenPrinterState implements PrinterStates {

    public HasTokenPrinterState() {
        System.out.println("|\nCurrently Printer space is in HasTokenState\n|");
    }

    @Override
    public void clickOnInsertTokenButton(PrintWorks printWorks) {
        return;
    }

    @Override
    public void clickOnStartPrinterSelectionButton(PrintWorks printWorks) {
        printWorks.setPrinterState(new SelectionPrinterState());
    }

    @Override
    public void insertToken(PrintWorks printWorks, Token token) {
        System.out.println("Token for Rs."+token.value+" accepted");
        printWorks.getTokenList().add(token);
    }

    @Override
    public void choosePrinter(PrintWorks printWorks, int codeNumber) throws Exception {
        throw new Exception("you need to click on start printer space selection button first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public void finalizeOrder(PrintWorks printWorks, int codeNumber) throws Exception {
        throw new Exception("print order cannot be finalized in hasMoney state");
    }

    @Override
    public List<Token> refundFullMoney(PrintWorks printWorks) throws Exception {
        System.out.println("Returned the full amount back in the Money Dispense Tray");
        printWorks.setPrinterState(new IdlePrinterState(printWorks));
        return printWorks.getTokenList();
    }

    @Override
    public void updatePrinterBatch(PrintWorks printWorks, Printer printer, int codeNumber) throws Exception {
        throw new Exception("you can not update Printer Batch in hasMoney state");
    }
}

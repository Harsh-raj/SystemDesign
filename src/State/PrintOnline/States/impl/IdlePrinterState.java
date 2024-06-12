package State.PrintOnline.States.impl;

import State.PrintOnline.PrintWorks;
import State.PrintOnline.PrintedDoc;
import State.PrintOnline.Printer;
import State.PrintOnline.States.PrinterStates;
import State.PrintOnline.Token;

import java.util.ArrayList;
import java.util.List;

public class IdlePrinterState implements PrinterStates {
    public IdlePrinterState() {
        System.out.println("|\nCurrently PrintWorks is in IdleState\n|");
    }

    public IdlePrinterState(PrintWorks printWorks){
        System.out.println("|\nCurrently PrintWorks is in IdleState\n|");
        printWorks.setTokenList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertTokenButton(PrintWorks printWorks) {
        printWorks.setPrinterState(new HasTokenPrinterState());
    }

    @Override
    public void clickOnStartPrinterSelectionButton(PrintWorks printWorks) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void insertToken(PrintWorks printWorks, Token token) throws Exception {
        throw new Exception("you can not insert Coin in idle state");
    }

    @Override
    public void choosePrinter(PrintWorks printWorks, int codeNumber) throws Exception {
        throw new Exception("you can not choose Printer space in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public void finalizeOrder(PrintWorks printWorks, int codeNumber) throws Exception {
        throw new Exception("print order can not be finalized in idle state");
    }

    @Override
    public List<Token> refundFullMoney(PrintWorks printWorks) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }

    @Override
    public void updatePrinterBatch(PrintWorks printWorks, Printer printer, int codeNumber) throws Exception {
        printWorks.getPrinterBatch().addPrinter(printer, codeNumber);
    }
}

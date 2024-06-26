package LLD.State.PrintOnline.States.impl;

import LLD.State.PrintOnline.*;
import LLD.State.PrintOnline.States.PrinterStates;

import java.util.List;

public class DispatchPrintOrder implements PrinterStates {
    public DispatchPrintOrder(PrintWorks printWorks, int codeNumber) throws Exception {
        System.out.println("|\nCurrently PrintWorks is in Dispatch LLD.AbstractFactory.State\n|");

        finalizeOrder(printWorks, codeNumber);
    }

    @Override
    public void clickOnInsertTokenButton(PrintWorks printWorks) throws Exception {
        throw new Exception("insert token button can not clicked on Dispatch state");
    }

    @Override
    public void clickOnStartPrinterSelectionButton(PrintWorks printWorks) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispatch state");
    }

    @Override
    public void insertToken(PrintWorks printWorks, Token token) throws Exception {
        throw new Exception("coin can not be inserted in Dispatch state");
    }

    @Override
    public void choosePrinter(PrintWorks printWorks, int codeNumber) throws Exception {
        throw new Exception("product can not be chosen in Dispatch state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not returned in Dispatch state");
    }

    @Override
    public void finalizeOrder(PrintWorks printWorks, int codeNumber) throws Exception {
        System.out.println("Printed Files have been packaged and would be delivered soon. Thank you for choosing us.");

        printWorks.getPrinterBatch().updateInUsePrinter(codeNumber);
        printWorks.setPrinterState(new IdlePrinterState(printWorks));

    }

    @Override
    public List<Token> refundFullMoney(PrintWorks printWorks) throws Exception {
        throw new Exception("refund can not be happen in Dispatch state");
    }

    @Override
    public void updatePrinterBatch(PrintWorks printWorks, Printer printer, int codeNumber) throws Exception {
        throw new Exception("Printer batch can not be updated in Dispatch state");
    }
}
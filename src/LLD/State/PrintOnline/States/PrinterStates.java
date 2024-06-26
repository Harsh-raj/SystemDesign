package LLD.State.PrintOnline.States;

import LLD.State.PrintOnline.PrintWorks;
import LLD.State.PrintOnline.Printer;
import LLD.State.PrintOnline.Token;

import java.util.List;

public interface PrinterStates {
    void clickOnInsertTokenButton(PrintWorks printWorks) throws Exception;

    void clickOnStartPrinterSelectionButton(PrintWorks printWorks) throws Exception;

    void insertToken(PrintWorks printWorks , Token token) throws Exception;

    void choosePrinter(PrintWorks printWorks, int codeNumber) throws Exception;

    int getChange(int returnChangeMoney) throws Exception;

    void finalizeOrder(PrintWorks printWorks, int codeNumber) throws Exception;

    List<Token> refundFullMoney(PrintWorks printWorks) throws Exception;

    void updatePrinterBatch(PrintWorks printWorks, Printer printer, int codeNumber) throws Exception;
}

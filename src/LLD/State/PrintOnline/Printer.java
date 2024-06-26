package LLD.State.PrintOnline;

public class Printer {
    private PrinterType printerType;

    private int printPrice;

    public PrinterType getPrinterType() {
        return printerType;
    }

    public void setPrinterType(PrinterType printerType) {
        this.printerType = printerType;
    }

    public int getPrintPrice() {
        return printPrice;
    }

    public void setPrintPrice(int printPrice) {
        this.printPrice = printPrice;
    }

    public PrintedDoc print(int files){
        return new PrintedDoc(files);
    }
}

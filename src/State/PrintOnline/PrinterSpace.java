package State.PrintOnline;

public class PrinterSpace {
    int code;
    Printer printer;
    boolean inUse;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public PrinterSpace(){

    }

    public PrinterSpace(int code, Printer printer, boolean inUse) {
        this.code = code;
        this.printer = printer;
        this.inUse = inUse;
    }
}

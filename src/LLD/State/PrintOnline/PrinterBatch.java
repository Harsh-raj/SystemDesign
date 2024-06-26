package LLD.State.PrintOnline;

public class PrinterBatch {
    PrinterSpace [] printerSpace = null;

    public PrinterBatch(int count) {
        printerSpace = new PrinterSpace[count];
        initialEmptyPrinterSpace();
    }

    public PrinterSpace[] getPrinterSpace() {
        return printerSpace;
    }

    public PrinterSpace findPrinterSpace(int codenumber){
        for(PrinterSpace printerSpaceElement:printerSpace){
            if(printerSpaceElement.code == codenumber)
                return printerSpaceElement;
        }
        return null;
    }

    public void setPrinterSpace(PrinterSpace[] printerSpace) {
        this.printerSpace = printerSpace;
    }


    public void initialEmptyPrinterSpace() {
        int startCode = 101;
        System.out.println("Printer space length: "+printerSpace.length);
        for (int i = 0; i < printerSpace.length; i++) {
            PrinterSpace space = new PrinterSpace();
            space.setCode(startCode);
            space.setInUse(true);
            printerSpace[i]= space;
            startCode++;
        }
    }

    public void addPrinter(Printer printer, int codeNumber) throws Exception {

        for (PrinterSpace printerSpaceElements: printerSpace) {
            if (printerSpaceElements.code == codeNumber) {
                if (printerSpaceElements.isInUse()) {
                    printerSpaceElements.printer = printer;
                    printerSpaceElements.setInUse(false);
                } else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public Printer getPrinter(int codeNumber) throws Exception {

        for (PrinterSpace printerSpaceElement : printerSpace) {
            if (printerSpaceElement.code == codeNumber) {
                if (printerSpaceElement.isInUse()) {
                    throw new Exception("Printer already in use... Please try another available printer or wait for it to complete its current order in progress! We appreciate your patience.");
                } else {
                    System.out.println("Printer ("+printerSpaceElement.code+") assigned.");
                    this.getPrinterSpace()[codeNumber].setInUse(true);
                    System.out.println("Printer 102: "+this.getPrinterSpace()[codeNumber].isInUse());
                    return printerSpaceElement.printer;
                }
            }
        }
        throw new Exception("Invalid Code");
    }

    public void updateInUsePrinter(int codeNumber){
        for (PrinterSpace printSpaceElement : printerSpace) {
            if (printSpaceElement.code == codeNumber) {
                printSpaceElement.setInUse(false);
            }
        }
    }
}

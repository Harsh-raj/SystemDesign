package LLD.SOLID.SingleResponsibility;

public class PrintInvoice {

    private Invoice invoice;
    public PrintInvoice(Invoice invoice){
        System.out.println("Book Name = "+invoice.book.name+" Book quantity = "+invoice.quantity+" Book price = "+invoice.book.price+"\n");
    }
}

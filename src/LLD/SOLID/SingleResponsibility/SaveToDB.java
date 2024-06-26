package LLD.SOLID.SingleResponsibility;

public class SaveToDB {
    private Invoice invoice;

    public SaveToDB(Invoice invoice){
        System.out.println(invoice.book.name+" invoice saved to DB");
    }
}

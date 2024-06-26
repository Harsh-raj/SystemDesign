package LLD.SOLID.SingleResponsibility;

public class Invoice {
    public Book book;
    public int quantity;

    public Invoice(Book book, int quantity){
        this.book = book;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        return this.quantity* this.book.price;
    }
}

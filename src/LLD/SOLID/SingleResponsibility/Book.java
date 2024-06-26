package LLD.SOLID.SingleResponsibility;

public class Book {
    int numPages;
    String name;
    int price;
    int year;

    public Book(int numPages, String name, int price, int year){
        this.numPages = numPages;
        this.name = name;
        this.price = price;
        this.year = year;
    }
}
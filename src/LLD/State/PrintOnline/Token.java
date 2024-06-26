package LLD.State.PrintOnline;

public enum Token {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100),
    TWOHUNDRED(200),
    FIVEHUNDRED(500),
    TWOTHOUSAND(2000);

    public int value;
    Token(int value) {
        this.value = value;
    }
}

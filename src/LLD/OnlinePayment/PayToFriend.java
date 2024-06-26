package LLD.OnlinePayment;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Debit the amount of PayToFriend");
    }

    @Override
    public void debitAmount() {
        System.out.println("0% fees charged");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the amount to PayToFriend");
    }
}

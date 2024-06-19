package Template.OnlinePayment;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("Debit the amount of PayToMerchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("2% fees charged");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the amount to PayToMerchant");
    }
}
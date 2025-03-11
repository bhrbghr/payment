package payment;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("پرداخت با کارت اعتباری: مبلغ " + amount + " پرداخت شد.");
    }

    @Override
    public String getPaymentDetails() {
        return "کارت اعتباری: " + cardNumber + " متعلق به " + cardHolderName;
    }
}


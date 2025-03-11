package payment;
public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("پرداخت با بیت‌کوین: مبلغ " + amount + " پرداخت شد.");
    }

    @Override
    public String getPaymentDetails() {
        return "بیت‌کوین: " + walletAddress;
    }
}

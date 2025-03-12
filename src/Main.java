import payment.*;

public class Main {
    public static void main(String[] args) {

        Customer regularCustomer = new RegularCustomer("علی");
        Customer premiumCustomer = new PremiumCustomer("زهرا");


        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890", "علی");
        PaymentStrategy payPalPayment = new PayPalPayment("ali@example.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("6234 9012 7658 0999");


        regularCustomer.makePayment(creditCardPayment, 100.0);
        premiumCustomer.makePayment(payPalPayment, 150.0);
        premiumCustomer.makePayment(bitcoinPayment, 200.0);


        regularCustomer.displayCustomerInfo();
        regularCustomer.showPaymentHistory();

        premiumCustomer.displayCustomerInfo();
        premiumCustomer.showPaymentHistory();
    }
}

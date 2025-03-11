package payment;

import java.util.ArrayList;

public abstract class Customer {
    protected String name;
    protected ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        paymentHistory.add(paymentStrategy.getPaymentDetails() + " مبلغ: " + amount);
    }

    public void showPaymentHistory() {
        for (String payment : paymentHistory) {
            System.out.println(payment);
        }
    }
}

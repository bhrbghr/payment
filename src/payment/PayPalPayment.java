package payment;


    public class PayPalPayment implements PaymentStrategy {
        private String email;

        public PayPalPayment(String email) {
            this.email = email;
        }

        @Override
        public void pay(double amount) {
            System.out.println("پرداخت با پی‌پال: مبلغ " + amount + " پرداخت شد.");
        }

        @Override
        public String getPaymentDetails() {
            return "پی‌پال: " + email;
        }
    }



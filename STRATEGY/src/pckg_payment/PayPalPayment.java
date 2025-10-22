package pckg_payment;

public class PayPalPayment implements PaymentStrategy {


    @Override
    public void performPayment(double amount) {
        System.out.println("Pay Pal payment - amount: " + amount);
    }
}

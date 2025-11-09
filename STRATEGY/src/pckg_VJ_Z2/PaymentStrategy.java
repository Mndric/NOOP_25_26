package pckg_VJ_Z2;

public interface PaymentStrategy {
    void pay(double amount);
    String getPaymentMethod();
}

package pckg_VJ_Z2;

public class PayPal implements PaymentStrategy{

    private String email;

    public PayPal(String email){
        this.email=email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Redirecting to PayPal...");
        System.out.println("PayPal account: " + email);
        System.out.printf("Amount: %.2f EUR%n", amount);
        System.out.println("PayPal payment completed successfully!");
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}

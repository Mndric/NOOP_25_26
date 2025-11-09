package pckg_VJ_Z2;

public class Cash implements PaymentStrategy {

    private String address;
    private String recipient;

    public Cash(String address, String recipient) {
        this.address = address;
        this.recipient = recipient;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Setting cash on delivery payment...");
        System.out.println("Recipient: " + recipient);
        System.out.println("Delivery address: " +  address);
        System.out.printf("Amount to pay on delivery: %.2f%n", amount);
        System.out.println("Order confirmed! Pay when you receive the package.");
    }

    @Override
    public String getPaymentMethod() {
        return "Cash";
    }
}

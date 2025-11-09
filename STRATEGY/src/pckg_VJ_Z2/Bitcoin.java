package pckg_VJ_Z2;

public class Bitcoin implements PaymentStrategy{

    private String bitcoinAddress;

    public Bitcoin(String bitcoinAddress){
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Bitcoin payment...");
        System.out.println("Bitcoin adress: " + bitcoinAddress);
        System.out.printf("Amount: %.2f EUR (converted to BTC)%n", amount);
        System.out.println("Waiting for blockchain confirmation...");
        System.out.println("Bitcoin payment confirmed!");
    }

    @Override
    public String getPaymentMethod() {
        return "Bitcoin";
    }
}

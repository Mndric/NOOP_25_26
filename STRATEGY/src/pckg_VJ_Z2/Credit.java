package pckg_VJ_Z2;

public class Credit implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;

    public Credit(String cardNumber, String cardHolder, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;

    }
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment...");
        System.out.println("Card: " + maskCardNumber(cardNumber));
        System.out.println("Cardholder: " + cardHolder);
        System.out.printf("Amount: %.2f EUR%n", amount);
        System.out.println("Payment successful with credit card payment!");
    }

    @Override
    public String getPaymentMethod() {
        return "Credit card";
    }
    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() == 4) {
            return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
        }
        return cardNumber;
    }
}

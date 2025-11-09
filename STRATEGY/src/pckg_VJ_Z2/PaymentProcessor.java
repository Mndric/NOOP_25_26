package pckg_VJ_Z2;

import pckg_payment.CreditCardPayment;
import pckg_payment.PayPalPayment;

public class PaymentProcessor {

    public static PaymentStrategy createCreditCardPayment(String cardNumber, String cardHolder, String expiryDate){
        return new Credit(cardNumber, cardHolder, expiryDate);
    }
    public static PaymentStrategy createCashOnDeliveryPayment(String address, String recipient){
        return new Cash(address, recipient);
    }
    public static PaymentStrategy createPayPalPayment(String email){
        return new PayPal(email);
    }
    public static PaymentStrategy createBitcoinPayment(String bitcoinAdderss){
        return new Bitcoin(bitcoinAdderss);
    }
}

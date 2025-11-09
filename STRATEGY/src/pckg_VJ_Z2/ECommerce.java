package pckg_VJ_Z2;

import pckg_payment.CreditCardPayment;

import java.util.Scanner;

public class ECommerce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shopping sp = new Shopping();

        System.out.println("===E COMMERCE PAYMENT SYSTEM===");

        sp.addItem("Laptop", 789.99);
        sp.addItem("Mouse", 30.90);
        sp.addItem("Keyboard", 50.0);

        boolean shopping = true;
        while(shopping){
            System.out.println("\nCurrent cart total: " + sp.getTotalAmount() + " EUR");
            System.out.println("\nAvailable payments: ");
            System.out.println("1. Credit card");
            System.out.println("2. Cash");
            System.out.println("3. PayPal");
            System.out.println("4. Bitcoin");
            System.out.println("5. Add more items");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");

            System.out.println("Enter your choice (1-7): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter card number: ");
                    String cardNumber = sc.nextLine();
                    System.out.println("Enter cardholder name: ");
                    String cardholderName = sc.nextLine();
                    System.out.println("Enter expiry date(MM/YY): ");
                    String expiryDate = sc.nextLine();

                    PaymentStrategy card = PaymentProcessor.createCreditCardPayment(cardNumber, cardholderName, expiryDate);
                    sp.setPaymentStrategy(card);
                    System.out.println("Credit card payment selected!");
                    break;
                case 2:
                    System.out.println("Enter delivery address: ");
                    String deliveryAddress = sc.nextLine();
                    System.out.println("Enter recipient name: ");
                    String recipientName = sc.nextLine();

                    PaymentStrategy cash = PaymentProcessor.createCashOnDeliveryPayment(deliveryAddress, recipientName);
                    sp.setPaymentStrategy(cash);
                    System.out.println("Cash payment selected!");
                    break;

                case 3:
                    System.out.println("Enter PayPal email: ");
                    String email = sc.nextLine();
                    PaymentStrategy paypal = PaymentProcessor.createPayPalPayment(email);
                    sp.setPaymentStrategy(paypal);
                    System.out.println("PayPal payment selected!");
                    break;

                case 4:
                    System.out.println("Enter Bitcoin address: ");
                    String bitcoinAddress = sc.nextLine();
                    PaymentStrategy bitcoin = PaymentProcessor.createBitcoinPayment(bitcoinAddress);
                    sp.setPaymentStrategy(bitcoin);
                    System.out.println("Bitcoin address payment selected!");
                    break;

                case 5:
                    System.out.println("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.println("Enter item price: ");
                    double price = sc.nextDouble();
                    sp.addItem(itemName, price);
                    System.out.println("Item added!");
                    break;
                case 6:
                    sp.checkout();
                    shopping = false;
                    break;
                case 7:
                    System.out.println("Thank you for shopping with us!");
                    shopping = false;
                    break;
                default:
                    System.out.println("Invalid choice! Choose from 1 to 7.");
            }

        }
    }
}

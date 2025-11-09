package pckg_VJ_Z2;

public class Shopping {
    private PaymentStrategy paymentStrategy;
    private double totalAmount;
    private String items;

    public Shopping(){
        this.totalAmount = 0.0;
        this.items = "";
    }

    public void addItem(String item, double price){
        items += "- " + item + " (" + price + " EUR)\n";
        totalAmount += price;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(){
        if(paymentStrategy == null){
            System.out.println("Error: Please select a payment method first!");
            return;
        }

        System.out.println("\n=== CHECKOUT ===");
        System.out.println("Items in cart: ");
        System.out.println(items);
        System.out.printf("Total amount: $%.2f\n", totalAmount);
        System.out.println("Payment method: " + paymentStrategy.getPaymentMethod());
        System.out.println("----------------------------");

        paymentStrategy.pay(totalAmount);

        items = "";
        totalAmount = 0.0;
    }
    public double getTotalAmount(){
        return totalAmount;
    }
    public String getItems(){
        return items;
    }
}

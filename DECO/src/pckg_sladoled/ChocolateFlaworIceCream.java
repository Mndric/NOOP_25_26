package pckg_sladoled;

public class ChocolateFlaworIceCream extends AbsSladoled {

    private double totalPrice;

    protected ChocolateFlaworIceCream(int amount, double price) {
        super(amount, price);
    }

    public ChocolateFlaworIceCream(int amount, double price, AbsSladoled sladoled) {
        this(amount, price);
        this.absSladoled = sladoled;
    }

    @Override
    protected double calculateTotalPrice() {
        if(absSladoled != null) {
            totalPrice = absSladoled.calculateTotalPrice() + amount * price;
        }else{
            totalPrice=  amount * price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "ChocolateFlaworIceCream{" +
                "price=" + totalPrice +
                '}';
    }
}

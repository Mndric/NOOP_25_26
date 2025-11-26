package pckg_sladoled;

public class VanilaFlaworIceCream extends AbsSladoled{

    private double totalPrice;
    protected VanilaFlaworIceCream(int amount, double price) {
        super(amount, price);
    }
    protected VanilaFlaworIceCream(int amount, double price, AbsSladoled sladoled) {
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
        return "VanilaFlaworIceCream{" +
                "price=" + totalPrice +
                '}';
    }
}

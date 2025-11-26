package pckg_sladoled;

public abstract class AbsSladoled {

    protected double price;
    protected int amount;
    protected AbsSladoled absSladoled;

    protected AbsSladoled(int amount, double price, AbsSladoled absSladoled) {
        this(amount, price);
        this.absSladoled = absSladoled;
    }

    protected AbsSladoled(int amount, double price) {
        this.price = price;
        this.amount = amount;
    }
    protected void setPrice(double price) {
        this.price = price;
    }
    protected void setAmonunt(int amonunt) {
        this.amount = amonunt;
    }
    protected abstract double calculateTotalPrice();

}

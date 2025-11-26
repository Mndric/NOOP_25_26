package pckg_ice_cream;

public class SimpleIceCreamDeco extends IceCreamDecorator{
    protected IceCream sndIceCream;

    protected SimpleIceCreamDeco(IceCream ic) {
        super(ic);
    }

    protected SimpleIceCreamDeco(IceCream ic, IceCream sndIC) {
        super(ic);
        this.sndIceCream = sndIC;
    }

    @Override
    public void getDescription() {
        decoIceCream.getDescription();
        sndIceCream.getDescription();
        System.out.println("Simple ice cream decorator!");
    }

    @Override
    public double getPrice() {
        return decoIceCream.getPrice() + sndIceCream.getPrice();
    }

    @Override
    public String toString() {
        return "SimpleIceCreamDeco{" +
                "sndIceCream=" + sndIceCream +
                ", decoIceCream=" + decoIceCream +
                ", unitPriceDeco=" + unitPriceDeco +
                '}';
    }
}

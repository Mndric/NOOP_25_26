package pckg_ice_cream;

public class WhippCreamDeco extends IceCreamDecorator {


    protected WhippCreamDeco(IceCream ic) {
        super(ic);
    }

    @Override
    public void getDescription() {
        decoIceCream.getDescription();
        System.out.println("Decorated with whipp cream!!");
    }

    @Override
    public double getPrice() {
        return decoIceCream.getPrice() + this.unitPriceDeco;
    }

    @Override
    public String toString() {
        return "WhippCreamDeco{" +
                "decoIceCream=" + decoIceCream +
                ", unitPriceDeco=" + unitPriceDeco +
                '}';
    }
}

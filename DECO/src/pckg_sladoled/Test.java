package pckg_sladoled;

public class Test {

    public static void main(String[] args) {
        VanilaFlaworIceCream vanilaFlaworIceCream = new VanilaFlaworIceCream(1,2);
        ChocolateFlaworIceCream chocolateFlaworIceCream = new ChocolateFlaworIceCream(2,2);
        BlackChocoTopping iceCream = new BlackChocoTopping(1,1, chocolateFlaworIceCream);
        iceCream.calculateTotalPrice();
        System.out.println(iceCream);
        AbsSladoled sladoled = new WallnutPowder(1, 1.5, iceCream);
        sladoled.calculateTotalPrice();
        System.out.println(sladoled);
    }
}

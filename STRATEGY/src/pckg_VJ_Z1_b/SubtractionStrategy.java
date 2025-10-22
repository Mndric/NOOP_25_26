package pckg_VJ_Z1_b;

public class SubtractionStrategy implements CalculationStrategy {
    @Override
    public Double performCalculation(Double fst, Double snd) {
        return fst - snd;
    }
}

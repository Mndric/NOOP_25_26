package pckg_VJ_Z1_a;

import pckg_VJ_Z1_b.CalculationStrategy;

public class Addition implements Kalkulacija {
    @Override
    public Double performCalculation(Double fst, Double snd) {
        return fst + snd;
    }

}

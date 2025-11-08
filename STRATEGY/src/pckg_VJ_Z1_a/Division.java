package pckg_VJ_Z1_a;

import pckg_VJ_Z1_b.CalculationStrategy;

public class Division implements Kalkulacija {
    @Override
    public float performCalculation(float fst, float snd) {
        if(snd == 0){
            System.out.println("Error: Division by zero");
            return 0;
        }
        return fst / snd;
    }
}

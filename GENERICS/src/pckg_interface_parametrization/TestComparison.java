package pckg_interface_parametrization;

public class TestComparison {
    public static void main(String[] args) {
        String sFst = "Tamo neki string...";
        String sSnd = "Novi string koji je puno dug i nema kraja...";
        CompareTWO<String> stringCompareTWO = new CompareTWO<>(sFst, sSnd);
        stringCompareTWO.performComparison();
        Integer iFst = 100;
        Integer iSnd = 100;
        CompareTWO<Integer> integerCompareTWO = new CompareTWO<>(iFst, iSnd);
        integerCompareTWO.performComparison();
        StringLengthComparison fst = new StringLengthComparison(sFst);
        StringLengthComparison snd = new StringLengthComparison(sSnd);
        CompareTWO<StringLengthComparison> stringLengthComparisonCompareTwo = new CompareTWO<>(fst, snd);
        stringLengthComparisonCompareTwo.performComparison();
    }
}

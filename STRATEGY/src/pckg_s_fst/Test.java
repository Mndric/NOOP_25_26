package pckg_s_fst;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> someLst = new ArrayList<String>();
        SortPrinciple sp1 = new SortPrinciple_1();
        SimpleSorter<String> simpleSorter = new SimpleSorter<>(someLst, sp1);
        simpleSorter.performSorting();
        simpleSorter.setSortPrinciple(new SortPrinciple_2());
        simpleSorter.performSorting();
    }
}
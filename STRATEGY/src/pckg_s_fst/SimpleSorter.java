package pckg_s_fst;

import java.util.List;

public class SimpleSorter <E> extends Sorter<E>{

    protected SimpleSorter(List<E> someLst, SortPrinciple sortPrinciple) {
        super(someLst, sortPrinciple);
    }

    @Override
    protected void performSorting() {
        sortPrinciple.sortElements(lst);
    }
}

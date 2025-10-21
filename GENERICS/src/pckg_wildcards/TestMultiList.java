package pckg_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMultiList {
    public static void main(String[] args) {
        String someString = "This is some simple string - it is evident!";
        String[] partsOfSomeString = someString.split(" ");
        List<String> listString =  new ArrayList<>(Arrays.asList(partsOfSomeString));
        System.out.println(Arrays.toString(partsOfSomeString));
        MultiListCLS<String> stringMultiListCLS = new MultiListCLS<>(listString);
        Integer[] intNums = {236, 44, 10, -100, 23, 32, 89, -234, 0, 1, 2, 3, 4, 5, 55};
        List<Integer> iList = new ArrayList<>(Arrays.asList(intNums));
        stringMultiListCLS.compareListLengths(iList);
    }
}

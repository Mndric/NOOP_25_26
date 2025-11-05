package pckg_enumeration;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        String[] someStrings = {"21", "novo", "vrijeme", "kad", "sad"};

        List<String> list = Arrays.asList(someStrings);
        Iterator<String> stringIterator = list.iterator();
        Client<String> stringClient = new Client<>(stringIterator);
        while(stringClient.hasSomeElement()){
            System.out.println(stringClient.getNextElement());
        }



        System.out.println(stringClient.hasSomeElement());
        System.out.println(stringClient.getNextElement());
        EnumerationConcrete<String> enumerationConcrete = new EnumerationConcrete<>();
        EnumerationToIterator<String> enumerationToIterator = new EnumerationToIterator<>(enumerationConcrete);
        Client<String> newStringClient = new Client<>(enumerationToIterator);
        while(newStringClient.hasSomeElement()){
            System.out.println(newStringClient.getNextElement());
        }
//        System.out.println(newStringClient.hasSomeElement());
//        System.out.println(newStringClient.getNextElement());
//        newStringClient.removeElement();

    }
}



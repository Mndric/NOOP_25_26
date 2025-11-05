package pckg_enumeration;

import java.util.Enumeration;
import java.util.Stack;

public class EnumerationConcrete<E> implements Enumeration<E> {
    @Override
    public boolean hasMoreElements() {
        return true;
    }

    @Override
    public E nextElement() {
        return (E) new String (1000);
    }
}

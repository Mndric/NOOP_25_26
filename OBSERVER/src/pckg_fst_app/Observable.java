package pckg_fst_app;

import java.util.Observer;

public interface Observable {

    void add(ObserverI ob);
    void remove(ObserverI ob);
    void notifyAllObservers();
}

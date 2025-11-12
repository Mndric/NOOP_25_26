package pckg_fst_cmd;

import java.util.List;

public class AddElementPosition<E> implements Cmd{

    private List<E> someList;
    private int idx;
    private E element;

    public AddElementPosition(E element, int idx,  List<E> lst ) {
        this.element = element;
        this.idx = idx;
        this.someList = lst;
    }

    @Override
    public void execute() {
        someList.add(idx,element);
        System.out.println("Added element on the position: " + idx);
    }

    @Override
    public void undo() {
        someList.remove(idx);
        System.out.println("Removed element from the position: " + idx);
    }

    @Override
    public void redo() {
        execute();
    }
}

package pckg_fst_cmd;

import java.util.List;

public class AddElementCMD<E> implements Cmd {

    private List<E> someList;
    private E element;

    public AddElementCMD(List<E> list, E element) {
        this.someList = list;
        this.element = element;
    }

    @Override
    public void execute() {
        someList.add(element);
        System.out.println("Added new element: " + element);
    }

    @Override
    public void undo() {
        someList.remove(element);
        System.out.println("Removed element: " + element);
    }

    @Override
    public void redo() {
        execute();
    }
}

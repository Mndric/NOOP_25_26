package pckg_fst_cmd;

import java.util.List;

public class PositionOfElement<E> implements Cmd{

    private List<E> someList;
    private E element;


    public PositionOfElement(List<E> someList, E element) {
        this.someList = someList;
        this.element = element;

    }

    @Override
    public void execute() {
        int pos = someList.indexOf(element);
        System.out.println("Index position of element is: " + pos);
    }

    @Override
    public void undo() {
        System.out.println("Nothing to undo on this command: " + getClass().getSimpleName());
    }

    @Override
    public void redo() {
        execute();
    }
}

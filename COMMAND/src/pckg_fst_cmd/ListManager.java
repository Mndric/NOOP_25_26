package pckg_fst_cmd;

import java.util.List;
import java.util.Stack;

public class ListManager<E> {

    private List<E> someList;
    private Cmd command;
    private final Stack<Cmd> undoStack;
    private final Stack<Cmd> redoStack;

    public ListManager(List<E> list ){
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        someList = list;
    }
    public void setCommand(Cmd command){
        this.command = command;
    }
    public void listAllElementsInList(){
        System.out.println("This is listing of all elements!!!");
        for(E element : someList){
            System.out.println(element);
        }
    }

    public void exeCommand(){
        command.execute();
        undoStack.add(command);
    }

    public void undoCmd(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo - the stack is empty!");
        }else {
            command = undoStack.pop();
            command.undo();
            listStackElements(undoStack);
            redoStack.add(command);
            listStackElements(redoStack);
        }
    }

    public void redoCmd(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to redo - the stack is empty!");
        }else {
            command = redoStack.pop();
            command.redo();
            listStackElements(redoStack);
            undoStack.add(command);
            listStackElements(undoStack);
        }

    }

    private void listStackElements(Stack<Cmd> someStack){
        System.out.println("\n============== " + someStack.getClass().getSimpleName() + " ==============");
        for(Cmd element : someStack){
            System.out.println(element);
        }
        System.out.println("======================================");
    }
}

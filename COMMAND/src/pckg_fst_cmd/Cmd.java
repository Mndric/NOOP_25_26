package pckg_fst_cmd;

public interface Cmd {

    void execute();
    void undo();
    void redo();
}

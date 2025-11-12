package pckg_simple_remote;

public class RemoteController {

    private Command command;
    private boolean flag;

    public RemoteController() {
        this.flag = true;
    }

    public void setCommand(Command cmd) {
        this.command = cmd;
    }

    public void remoteControllerButtonPressed(){
        if(flag){
            command.execute();
            flag = false;
        }else{
            command.undo();
            flag = true;
        }
    }
}

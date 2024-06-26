package LLD.Command;

import java.util.ArrayList;

public class Controller {
    private ArrayList<Command> commands;

    public Controller(){
        commands = new ArrayList<Command>();
    }

    public Controller setCommand(Command command){
        this.commands.add(command);
        return this;
    }

    public void pressButton(int i){
        commands.get(i).execute();
    }
}

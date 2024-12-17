package com.shrayansh.commandPattern.command;

import com.shrayansh.commandPattern.receiver.Ac;

public class TurnOffAcCommand implements Command {

    private Ac ac;

    public TurnOffAcCommand(Ac ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("AC is turned off");
        ac.turnOffAc();
    }

    @Override
    public void undo() {
        System.out.println("Undoing the command");
        ac.turnOnAc();
    }
}

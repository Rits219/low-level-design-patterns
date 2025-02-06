package com.shrayansh.behavioural.commandPattern.command;

import com.shrayansh.behavioural.commandPattern.receiver.Ac;

public class TurnOnAcCommand implements Command {

    private Ac ac;

    public TurnOnAcCommand(Ac ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("AC is turned on");
        ac.turnOnAc();
    }

    @Override
    public void undo() {
        System.out.println("Undoing the command");
        ac.turnOffAc();
    }
}

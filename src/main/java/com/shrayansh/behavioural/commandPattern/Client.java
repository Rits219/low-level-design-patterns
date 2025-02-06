package com.shrayansh.behavioural.commandPattern;

import com.shrayansh.behavioural.commandPattern.command.TurnOffAcCommand;
import com.shrayansh.behavioural.commandPattern.invoker.MyRemoteControl;
import com.shrayansh.behavioural.commandPattern.receiver.Ac;

public class Client {
    public static void main(String[] args) {
        Ac ac = new Ac();
        MyRemoteControl remoteControl = new MyRemoteControl();
        remoteControl.setCommand(new TurnOffAcCommand(ac));
        remoteControl.pressButton();

        remoteControl.setCommand(new TurnOffAcCommand(ac));
        remoteControl.pressButton();

        remoteControl.undo();
        remoteControl.undo();
    }
}

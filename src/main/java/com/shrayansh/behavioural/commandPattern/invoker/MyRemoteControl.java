package com.shrayansh.behavioural.commandPattern.invoker;

import com.shrayansh.behavioural.commandPattern.command.Command;

import java.util.Stack;

public class MyRemoteControl {
    Command command;
    Stack<Command> commandStack;

    public MyRemoteControl() {
        this.commandStack = new Stack<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandStack.push(command);
    }

    public void undo() {
        if (!commandStack.isEmpty()) {
            Command command = commandStack.pop();
            command.undo();
        }
    }
}

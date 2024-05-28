package com.santhosh.patterns.command;

public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void pressButton() {
        command.execute();
    }

}

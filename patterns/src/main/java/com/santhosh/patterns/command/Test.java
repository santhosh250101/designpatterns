package com.santhosh.patterns.command;

public class Test {
    public static void main(String[] args) {

        // receiver obj

        Television television = new Television();

        // invoker obj

        RemoteControl remoteControl = new RemoteControl();

        OnCommand onCommand = new OnCommand(television);

        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

    }
}

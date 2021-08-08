package org.learn.david.behavioral.command;

public class TurnOnCommand implements Command{

    ElectronicDevice elDevice;

    public TurnOnCommand(ElectronicDevice elDevice) {
        this.elDevice = elDevice;
    }

    @Override
    public void execute() {
        elDevice.on();
    }

    @Override
    public void undo() {
        elDevice.off();
    }
}

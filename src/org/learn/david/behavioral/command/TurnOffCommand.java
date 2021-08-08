package org.learn.david.behavioral.command;

public class TurnOffCommand implements Command{

    ElectronicDevice elDevice;

    public TurnOffCommand(ElectronicDevice elDevice) {
        this.elDevice = elDevice;
    }

    @Override
    public void execute() {
        elDevice.off();
    }

    @Override
    public void undo() {
        elDevice.on();
    }
}

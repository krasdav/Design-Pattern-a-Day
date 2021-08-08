package org.learn.david.behavioral.command;

public class CommandDemo {

    public static void main(String[] args) {
        ElectronicDevice device = DeviceRemote.getDevice("Radio");
        Command turnOn = new TurnOnCommand(device);
        DeviceButton onPressed = new DeviceButton(turnOn);

        onPressed.press();
        onPressed.undoPress();

        device = DeviceRemote.getDevice("TV");
        turnOn = new TurnOnCommand(device);
        onPressed = new DeviceButton(turnOn);

        onPressed.press();
        onPressed.undoPress();



    }
}

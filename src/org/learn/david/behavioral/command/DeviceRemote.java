package org.learn.david.behavioral.command;

public class DeviceRemote {

    public static ElectronicDevice getDevice(String device){
        if( device.equals("Radio")){
            return new Radio();
        }
        return new TV();
    }
}

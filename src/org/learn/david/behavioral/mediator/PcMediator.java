package org.learn.david.behavioral.mediator;

public class PcMediator implements Mediator{
    private Fan fan;
    private PowerButton powerButton;
    private PowerSupply powerSupply;


    @Override
    public void turnOfFan() {
        System.out.println("Turning off fan and Power Supply");
        fan.offStatus();
        powerSupply.offStatus();
    }

    @Override
    public void turnOfPowerSupply() {
        System.out.println("Turning off fan and Power Supply");
        fan.offStatus();
        powerSupply.offStatus();
    }

    @Override
    public void turnOfPc() {
        System.out.println("Turning off PC");
        fan.offStatus();
        powerSupply.offStatus();
        powerButton.offStatus();
    }

    @Override
    public void setComponent(Component component) {
        switch ( component.getName()){
            case "Power Button" : powerButton = (PowerButton) component; break;
            case "Power Supply" : powerSupply = (PowerSupply) component; break;
            case "Fan" : fan = (Fan) component; break;
        }
    }
}

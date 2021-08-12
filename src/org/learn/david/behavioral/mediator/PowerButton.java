package org.learn.david.behavioral.mediator;

public class PowerButton implements Component {

    private String name = "Power Button";
    private Mediator mediator;


    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return this.name;
    }

    void offStatus(){
        System.out.println("PowerButton - press, PC - off");
    }
}

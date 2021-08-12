package org.learn.david.behavioral.mediator;

public class Fan implements Component{
    private String name = "Fan";
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return this.name;
    }

    void turnOf(){
        mediator.turnOfFan();
    }

    void offStatus(){
        System.out.println("Fan - off");
    }
}

package org.learn.david.structural.facade.complexclass;

public class Farm {
    private int employees = 0;
    private int animals = 0;
    private int tree = 0;
    private boolean fence = false;
    private boolean house = false;

    public Farm() {
    }

    public void plantTrees(int numberOfTrees) {
        tree += numberOfTrees;
    }

    public void addAnimals(int animalsToAdd){
        animals += animalsToAdd;
    }

    public void employPeople(int emplyeedPeople){
        employees += emplyeedPeople;
    }

    public void buildAHouse(){
        house = true;
    }

    public void buildAFence(){
        fence = true;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "employees=" + employees +
                ", animals=" + animals +
                ", tree=" + tree +
                ", fence=" + fence +
                ", house=" + house +
                '}';
    }
}

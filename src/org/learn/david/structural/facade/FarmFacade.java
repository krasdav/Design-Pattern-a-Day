package org.learn.david.structural.facade;

import org.learn.david.structural.facade.complexclass.Farm;

public class FarmFacade {
    private String plan;

    public FarmFacade() {
    }

    public Farm getFarmInstance(String plan){
        Farm farm = new Farm();
        switch ( plan ){
            case "LUXURY" : buildLuxuryFarm(farm); break;
            case "BASIC" : buildBasicFarm(farm); break;
            case "NICE" : buildNiceFarm(farm); break;
        }
        return farm;
    }

    private void buildNiceFarm(Farm farm){
        farm.addAnimals(7);
        farm.buildAFence();
        farm.buildAHouse();
        farm.employPeople(3);
        farm.plantTrees(8);
    }

    private void buildBasicFarm(Farm farm){
        farm.addAnimals(5);
        farm.buildAFence();
        farm.employPeople(2);
    }

    private void buildLuxuryFarm(Farm farm){
        farm.addAnimals(10);
        farm.buildAFence();
        farm.buildAHouse();
        farm.employPeople(5);
        farm.plantTrees(15);
    }
}

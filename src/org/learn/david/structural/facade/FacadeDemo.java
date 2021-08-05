package org.learn.david.structural.facade;

import org.learn.david.structural.facade.complexclass.Farm;

public class FacadeDemo {

    public static void main(String[] args) {
        FarmFacade farmFacade = new FarmFacade();
        Farm farm = farmFacade.getFarmInstance("BASIC");
        System.out.println(farm);
        farm = farmFacade.getFarmInstance("LUXURY");
        System.out.println(farm);
    }
}

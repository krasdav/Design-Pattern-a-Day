package org.learn.david.structural.flyweight;

import java.awt.*;

public class Cube {
    private Color color;
    private int size;

    public Cube(Color color) {
        this.color = color;
    }

    public Cube(){
    }

    public void drawCube(int size){
        this.size = size;
        System.out.println("Cube : " + this.size + ", " + color );
    }

    public void drawCubeNoFly(int size, Color color){
        System.out.println("Cube : " + size + ", " + color );
    }
}

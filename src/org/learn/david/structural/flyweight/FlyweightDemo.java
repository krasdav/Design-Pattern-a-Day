package org.learn.david.structural.flyweight;

import java.awt.*;
import java.util.Random;

public class FlyweightDemo {

    private static Color[] colors = { Color.black, Color.cyan, Color.blue, Color.white, Color.gray, Color.green, Color.red};

    public static void main(String[] args) {

        for( int i = 0; i < 1000000; i++){
            Cube cube = CubeFactory.getCube(getRanomColor());
            cube.drawCube(getRandomSize());
        }
    }

    private static int getRandomSize() {
        Random rand = new Random();
        return rand.nextInt(1500);
    }

    private static Color getRanomColor() {
        Random rand = new Random();
        int randIt = rand.nextInt(6);
        return colors[randIt];
    }

}

package org.learn.david.structural.flyweight;

import java.awt.*;
import java.util.HashMap;

public class CubeFactory {
    private static final HashMap<Color, Cube> cubesByColor = new HashMap<>();

    public static Cube getCube(Color color){
        Cube cube = cubesByColor.get(color);
        if( cube == null){
            cube = new Cube(color);
            cubesByColor.put(color,cube);
        }
        return cube;
    }
}

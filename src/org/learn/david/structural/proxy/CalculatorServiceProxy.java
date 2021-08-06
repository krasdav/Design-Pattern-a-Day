package org.learn.david.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CalculatorServiceProxy implements CalculatorService{

    private CalculatorService calculatorService = new CalculatorServiceImpl();
    private static List<Integer> bannedNumbers = new ArrayList<>();

    static{
        bannedNumbers.addAll(List.of(5,7,9,11));
    }

    @Override
    public int add(int a, int b) {
        if(bannedNumbers.contains(a) || bannedNumbers.contains(b)){
            System.out.println("These numbers are banned, returing 0");
            return 0;
        }
        return calculatorService.add(a,b);
    }

    @Override
    public int multiply(int a, int b) {
        if(bannedNumbers.contains(a) || bannedNumbers.contains(b)){
            System.out.println("These numbers are banned, returing 0");
            return 0;
        }
        return calculatorService.multiply(a,b);
    }
}

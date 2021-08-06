package org.learn.david.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        CalculatorService calc = new CalculatorServiceImpl();
        CalculatorService calcProxy = new CalculatorServiceProxy();

        System.out.println("Adding with calc service 5 + 6 : " + calc.add(5,6));
        System.out.println("Adding with proxy calc service 5 + 6 :" + calcProxy.add(5,6));

    }
}

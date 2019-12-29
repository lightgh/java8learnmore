package com.chinakalight.generics;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 29/12/2019
 */
public class DemoClassInterfaceTest {
    public static void main(String[] args) {
        DemoClassInterface demoClassInterface = new DemoClassInterface();
        String val = demoClassInterface.doReverseOperation(894845);
        Integer val2 = demoClassInterface.doSomeOperation("38982323");

        System.out.println(String.format("STRING VAL: %s\nINTEGER VAL: %d\n", val, val2));
    }
}

package com.chinakalight.generics;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 29/12/2019
 */
public class DemoClassInterface implements DemoInterface<String, Integer> {

    @Override
    public Integer doSomeOperation(String t){
        return Integer.valueOf(t);
    }

    @Override
    public String doReverseOperation(Integer t){
        return String.valueOf(t);
    }
}

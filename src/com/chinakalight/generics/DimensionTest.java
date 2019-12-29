package com.chinakalight.generics;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 29/12/2019
 */
public class DimensionTest {
    public static void main(String[] args) {
        Dimension<Integer> dimension =  new Dimension<>(456, 343, 233);
//        Dimension<Person> dimension =  new Dimension<>(new Person(), new Person(), new Person());
        System.out.println(dimension);
    }
}

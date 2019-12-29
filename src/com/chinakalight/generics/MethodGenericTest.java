package com.chinakalight.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 29/12/2019
 */
public class MethodGenericTest {
    public static void main(String[] args) {
        String[] listWords = {"Learning", "Continues"};
        Integer[] listNumbers = {23, 45};
        int count = MethodGeneric.countAllOccurrences(listWords, 67);
        System.out.printf("%s: %d\n", "Number of Occurrence", count);

        int count2 = MethodGeneric.countAllOccurrences(listNumbers, "45");
        System.out.printf("%s: %d\n", "Number of Occurrence", count2);
    }
}

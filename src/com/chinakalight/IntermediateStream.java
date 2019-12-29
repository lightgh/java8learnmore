package com.chinakalight;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 14/11/2019
 */
public class IntermediateStream {
    public static void main(String[] args) {

        List<String> list = Stream.of("Monkey", "Lion", "Giraffe", "Lemur")
                .filter(s -> s.startsWith("L"))
                .filter(s -> s.contains("e"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        IntStream listNums = IntStream.of(34, 45, 23, 23, 22, 222, 33, 444, 222, 11, 3, 1, 6, 7, 33, 4, 90, 3, 983, 5);

        listNums.mapToObj(value -> {
            return Integer.valueOf(value);
        });
        listNums.forEach(System.out::println);

        Stream<String> countries = Stream.of("Nigeria", "Cordevioir");

        System.out.println(list);
    }
}
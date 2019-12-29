package com.chinakalight;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 *     Mastering How to create Streams in JAVA
 * Date: 11/11/2019
 */
public class StreamBasic {


    public static void main(String[] args) {
        List<Integer> listOfNames = Stream.of("Nathaniel", "James", "Janet", "James", "Nathan", "Peterson", "Jonah", "Timothy", "Samuel", "Jonathan",
                "Jephta", "Simean", "Siman", "Oner", "Jotham", "James")
                .filter(e -> e.startsWith("J") || e.startsWith("S"))
                .sorted()
                .map(String::toUpperCase)
                .distinct()
                .sorted(String::compareToIgnoreCase)
                .map(String::length)
                .limit(4)
                .collect(toList());

        System.out.println(listOfNames);

        List<Point> cordinates = Stream.of(pointFactory(12, 45), pointFactory(45, 78))
                .filter( e -> e.x > 12)
                .distinct()
                .limit(10)
                .collect(toList());

        System.out.println(cordinates);

//        List<Long> listOfNum = Stream.of(12L, 67L, 90L, 33L, 100L)
        Optional<Long> listOfNum = Stream.of(12L, 67L, 90L, 33L, 100L)
                .distinct()
                .filter(e -> e > 20L)
                .limit(2)
                .findFirst();

        System.out.println(listOfNum.get());

        IntStream oneTwoThree = IntStream.of(1, 2, 3, 4);
//        System.out.println("ONE-TWO-THREE: " + oneTwoThree);

        IntStream positiveSingleDigits = IntStream.rangeClosed(1, 9);

        positiveSingleDigits.forEach(e -> System.out.print(e + " "));

        System.out.println("");

        IntStream powersOfTwo = IntStream.iterate(1, i -> i * 2 );

//        powersOfTwo.forEach(f -> System.out.println(f+ " "));

        IntStream chars = "ABC".chars();

        chars.forEach(f -> System.out.println(f));

        IntStream randomInts = new Random().ints();

//        randomInts.forEach(r -> System.out.println(r));

        // Stream an Array
        String[] array = {"Monkey", "Lion", "Giraffe", "Lemur"};
        Stream<String> stream2 = Stream.of(array);

        Stream<String> stream = Stream.of("Monkey", "Lion", "Giraffe", "Lemur" );

        // Stream from a Collection
        List<String> list = Arrays.asList("Monkey", "Lion", "Giraffe", "Lemur");
        Stream<String> streamFromList = list.stream();

        Set set = new HashSet<>(list);
        Stream<String> streamFromSet = set.stream();

        try {
            Stream<String> lines = Files.lines(Paths.get("/home/light/Documents/imobackup.sql"));
            lines.forEach(el -> System.out.println(el));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static Point pointFactory(int x, int y){
        return new Point(x, y);
    }
}

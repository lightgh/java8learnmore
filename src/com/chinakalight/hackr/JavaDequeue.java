package com.chinakalight.hackr;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author - Chinaka .I. Light <ichinaka@byteworks.com.ng>
 * Date: 16/12/2019
 */
public class JavaDequeue {

    public static void main(String[] args) {
        Deque deque = new LinkedList<>();
        Deque deque1 = new ArrayDeque<>();

        deque.add(45);
        deque.add(56);

        deque.stream().forEach(System.out::println);

        System.out.println("");

        enqueueData(deque, 100);
        enqueueData(deque, 135);

        deque.stream().forEach(System.out::println);

        dequeueData(deque, 90);
        dequeueData(deque, 945);

        System.out.println("");

        deque.stream().forEach(System.out::println);
    }

    private static void enqueueData(Deque deque, Integer data){
        deque.add(data);
    }

    private static void dequeueData(Deque deque, Integer data){
        deque.addFirst(data);
    }
}

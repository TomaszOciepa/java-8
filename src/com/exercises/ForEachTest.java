package com.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aA", "Bb", "cc", "Dd");

        System.out.println(list);

        //        list.forEach(n-> System.out.println(n.toUpperCase()));

        Consumer<String> consumer = c -> System.out.println(c.toUpperCase());

        list.forEach(consumer);
    }
}

package com.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MathTest {

    public static void main(String[] args) {

        getResult(list -> Collections.max(list), parameter -> System.out.println("Wynik: "+ parameter));

        getResult(list -> {
            int sum = 0;
            for (Integer i : list) {
                sum = i;
            }
            return sum;
        }, System.out::println);
    }

    public static void getResult(Function<List<Integer>, Integer> o, Consumer<Integer> c){
        List<Integer> list = Arrays.asList(5, 3, 2, -5, 1);
        int value = o.apply(list);
        c.accept(value);
    }
}

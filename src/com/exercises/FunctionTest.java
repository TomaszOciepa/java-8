package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Przem", "Tomasz", "Klaudia");

        System.out.println(list);


        Function<List<String>, List<Integer>> f = inputList -> {
          List<Integer> result = new ArrayList<>();
         inputList.forEach(o -> result.add(o.length()));
         return result;
        };



        List<Integer> integerList = f.apply(list);

        System.out.println(integerList);


    }
}

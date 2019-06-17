package com.exercises;

import java.util.Arrays;
import java.util.List;

public class MathTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 2, -5, 9);

        getResult(list, new MaxOperate());
    }

    public static void getResult(List<Integer> ints, MathOperation o ){

        int value = o.calculate(ints);

        System.out.println("result: "+ value);
    }
}

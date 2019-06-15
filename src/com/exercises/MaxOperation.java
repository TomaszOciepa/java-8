package com.exercises;

import java.util.Collections;
import java.util.List;

public class MaxOperation implements MathOperation {
    @Override
    public Integer calculate(List<Integer> list) {

        //        int max = list.get(0);
//
//        for (Integer e : list) {
//            if (e > max) {
//                max = e;
//            }
//        }
//
//        return min;
        return Collections.max(list);
    }
}

package com.exercises;

import java.util.Collections;
import java.util.List;

public class MinOperate implements MathOperation {
    @Override
    public Integer calculate(List<Integer> list) {


        //        int min = list.get(0);
//
//        for (Integer e : list) {
//            if (e < min) {
//                min = e;
//            }
//        }
//
//        return min;


        return Collections.min(list);
    }
}

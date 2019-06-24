package com.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DishStreamTest {

    public static void main(String[] args) {

        List<Dish> dishes = Arrays.asList(
                new Dish("burger", false, 1200),
                new Dish("pizza", false, 1000),
                new Dish("salat", true, 400),
                new Dish("tomatos soup", true, 400),
                new Dish("lasange", false, 1100)
        );


        System.out.println(dishes);
        System.out.println("-------------------");
        //System.out.println(dishes.stream().sorted((d1, d2 )-> d2.getCalories() - d1.getCalories()).collect(Collectors.toList()));

        sortByCalories(dishes).forEach(System.out::println);
        
    }

    private static List<Dish> sortByCalories(List<Dish> dishes){
        return dishes.stream().sorted((d1, d2 )-> d1.getCalories() - d2.getCalories()).collect(Collectors.toList());
    }
}

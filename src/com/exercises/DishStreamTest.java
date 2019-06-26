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

        System.out.println("-------------------");
        getNames(dishes).forEach(System.out::println);

        System.out.println("-------------------");

        System.out.println(sumCalories(dishes));

        System.out.println("-------------------");

        onlyVegetarianDishes(dishes).forEach(System.out::println);

        System.out.println("-------------------");

        sortByCaloriesLimit(4, dishes).forEach(System.out::println);

        System.out.println("-------------------");

        getCloriesBigestThan500(dishes).forEach(System.out::println);

    }

    private static List<Dish> sortByCalories(List<Dish> dishes){
        return dishes.stream().sorted((d1, d2 )-> d1.getCalories() - d2.getCalories()).collect(Collectors.toList());
    }

    private static List<String> getNames(List<Dish> dishes){
        return dishes.stream().map(Dish::getName).collect(Collectors.toList());
    }

    private static Integer sumCalories(List<Dish> dishes){

        //return dishes.stream().map(dish -> dish.getCalories()).reduce(0, (sum, cal) -> sum + cal);

        return dishes.stream().mapToInt(Dish::getCalories).sum();
    }

    private static List<Dish> onlyVegetarianDishes(List<Dish> dishList){
        return dishList.stream().filter(dish -> dish.vegetarian == true).collect(Collectors.toList());
    }

    private static List<Dish> sortByCaloriesLimit(int limit, List<Dish> dishList){
        return dishList.stream().sorted((d1, d2) -> d2.getCalories() - d1.getCalories()).limit(limit).collect(Collectors.toList());
    }

    private static List<Dish> getCloriesBigestThan500(List<Dish> dishList){
        return dishList.stream().filter(dish -> dish.getCalories() > 500).sorted((d1,d2)->d2.getCalories() - d1.getCalories()).collect(Collectors.toList());
    }
}

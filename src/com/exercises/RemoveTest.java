package com.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
                "RealMadrid",
                "Java",
                "",
                "Developer",
                "",
                "Linux"
        ));


        System.out.println(list);


        list.removeIf(l-> l.isEmpty());

        list.removeIf((String l )->l.isEmpty());

        list.removeIf((String l) -> {
            return l.isEmpty();
        });

        
        System.out.println(list);
    }
}

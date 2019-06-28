package com.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LetterCounter {

    public static void main(String[] args) {

        String[] words = new String[]{"hello", "academy", "java", "junior"};
        List<Character> letters = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {

                letters.add(words[i].charAt(j));
            }
        }

        Function<List<Character>, Integer> r = inputList -> {
            List<Character> uniqueLetters =
                    inputList.stream().distinct().collect(Collectors.toList());
            int result = uniqueLetters.size();
            return result;
        };

        int result = r.apply(letters);
        System.out.println(result);

        
    }
}
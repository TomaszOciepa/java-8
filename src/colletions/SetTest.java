package colletions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        mySet.add("Tomek");
        mySet.add("Klaudia");
        mySet.add("Przem");
        mySet.add("Przem");
        System.out.println(mySet);

        Set<String> secondSet = new TreeSet<>();

        secondSet.add("Gdańsk");
        secondSet.add("Warszawa");
        secondSet.add("Kraków");
        System.out.println(secondSet);

        secondSet.remove("Kraków");
        System.out.println(secondSet);


        System.out.println("Iterowanie po set foreach");
        for (String item : mySet){
            System.out.println(item);
        }



    }
}

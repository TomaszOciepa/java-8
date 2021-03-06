package colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Tomek", "Klaudia", "Przem", "Marcin");

        System.out.println("myList: "+myList);

        List<String> clubsList = Arrays.asList("Real Madird", "Fc Barcelona", "Liverpool", "Juventus");
        System.out.println("clubs list: "+clubsList);

        List<String> bothList = new ArrayList<>();

        bothList.addAll(clubsList);
        bothList.addAll(myList);

        System.out.println(bothList.isEmpty());


        System.out.println("bothList: "+ bothList);
        bothList.add("Tomek");
        System.out.println("bothList: "+ bothList);


        System.out.println(bothList.contains("Tomek"));

        System.out.println(bothList.isEmpty());
        System.out.println(bothList.size());
        System.out.println(bothList.indexOf("Tomek"));
        System.out.println(bothList.lastIndexOf("Tomek"));

        bothList.remove("Tomek");

        System.out.println(bothList);

        bothList.remove("Tomek");
        System.out.println(bothList);

        System.out.println("Iterowanie po liście foreach");
        for (String item : bothList){
            System.out.println(item);
        }

        System.out.println("Iterowanie po liście for");
        for (int i = 0; i < bothList.size(); i++) {

            System.out.println(bothList.get(i));

        }
    }

}

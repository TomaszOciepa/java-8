package colletions;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> cityMap = new HashMap<>();

        cityMap.put("Gdańsk", 450000);
        cityMap.put("Sopot", 150000);
        cityMap.put("Gdynia", 250000);

        System.out.println("cityMap "+cityMap);

        Map<String, Integer> otherCityMap = new HashMap<>();
        otherCityMap.put("Kraków", 400000);
        otherCityMap.put("Warszawa", 600000);
        otherCityMap.put("Sopot", 600000);
        System.out.println("otherCityMap "+otherCityMap);

        cityMap.putAll(otherCityMap);
        System.out.println(cityMap);

        System.out.println(cityMap.get("Gdańsk"));
        System.out.println(cityMap.size());
        System.out.println(cityMap.containsKey("Kraków"));
        System.out.println(cityMap.containsValue(450000));

        System.out.println("Iterowanie po kluczach");
        for (String key : otherCityMap.keySet()){
            System.out.println(key);
        }

        System.out.println("Iterowanie po wartościach");
        for (Integer value : otherCityMap.values()){
            System.out.println(value);
        }

        System.out.println("Iterowanie po kluczach i pobieranie wartości");
        for (String key : otherCityMap.keySet()){

            Integer value = otherCityMap.get(key);
            System.out.println(key +" : "+value);
        }

        System.out.println("Iterowanie po kluczach i wartościach");
        for (Map.Entry<String, Integer> entry : otherCityMap.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key+" : "+value);
        }

        System.out.println("0.3 == 0.1 + 0.2: " + (0.3 == 0.1 + 0.2)); // !!!
        System.out.println("0.3 == 0.1 + 0.2: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.000001));

        System.out.println("test == test: " + (new String("test") == new String("test")));
        System.out.println("test equals test: " + new String("test").equals(new String("test")));

        String reference1 = new String("something");
        String reference2 = reference1;
        System.out.println("reference1 == reference2: " + (reference1 == reference2));

    }
}

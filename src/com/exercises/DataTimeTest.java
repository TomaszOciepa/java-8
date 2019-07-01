package com.exercises;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class DataTimeTest {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(7, 15);
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        System.out.println(localTime.toString());

        LocalTime lt2 = LocalTime.parse("16:10:41.123");
        System.out.println(lt2);
        System.out.println(lt2.getNano());
        System.out.println(lt2.get(ChronoField.MILLI_OF_SECOND));

    }
}

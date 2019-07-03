package com.exercises;

import java.time.*;
import java.time.temporal.ChronoField;

public class DataTimeTest {
    public static void main(String[] args) {

//        LocalTime localTime = LocalTime.of(7, 15);
//        System.out.println(localTime);
//        System.out.println(localTime.getHour());
//        System.out.println(localTime.getMinute());
//        System.out.println(localTime.getSecond());
//
//        System.out.println(localTime.toString());
//
//        LocalTime lt2 = LocalTime.parse("16:10:41.123");
//        System.out.println(lt2);
//        System.out.println(lt2.getNano());
//        System.out.println(lt2.get(ChronoField.MILLI_OF_SECOND));

//        LocalDateTime ldt = LocalDateTime.of(2019, 07, 03, 17, 35);
//
//        System.out.println(ldt);
//
//        LocalTime lt = ldt.toLocalTime();
//        System.out.println(lt);
//
//        LocalDate ld = ldt.toLocalDate();
//        System.out.println(ld);

        ZoneId zoneId = ZoneId.systemDefault();

        System.out.println("Defoult zone "+zoneId);

        ZoneId zoneId1 = ZoneId.of("Australia/Sydney");

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneId1);

        System.out.println(zdt);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime);

    }
}

package com.exercises;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Random;

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

        //        ZoneId zoneId = ZoneId.systemDefault();
        //
        //        System.out.println("Defoult zone "+zoneId);
        //
        //        ZoneId zoneId1 = ZoneId.of("Australia/Sydney");
        //
        //        LocalDateTime ldt = LocalDateTime.now();
        //        System.out.println(ldt);
        //
        //        ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneId1);
        //
        //        System.out.println(zdt);
        //
        //        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        //
        //        System.out.println(zonedDateTime);

        //        LocalTime now = LocalTime.now();
        //        System.out.println(now);
        //
        //        Duration duration = Duration.of(10, ChronoUnit.MINUTES);
        //
        //        System.out.println(now.plus(duration));
        //
        //        LocalTime lt = LocalTime.of(8, 0);
        //
        //        System.out.println(Duration.between(now, lt));

        //        LocalTime start = LocalTime.now();
        //        for (int i = 0; i < 1000; i++) {
        //            System.out.println(new Random().nextInt());
        //        }
        //
        //        LocalTime stop = LocalTime.now();
        //
        //        System.out.println(Duration.between(start, stop));

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime nowPlus2H = now.plusHours(2).plusDays(2).plusMonths(2).plusYears(2);

        System.out.println(now);
        System.out.println(nowPlus2H);


    }
}

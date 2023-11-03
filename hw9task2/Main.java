package org.hw9task2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        Date birthDate = new Date(87, 11, 9, 22, 15, 20);

//      1 sec = 1000 msec
//      1 min = 60 sec = 60000 msec
//      1 hour = 60 min = 3600 sec = 36000000 msec
//      1 day = 24 hours = 1440 min = 86400 sec = 86400000 mse

        long difference = now.getTime() - birthDate.getTime();

        long seconds = (difference % 60_000) / 1000;
        long minutes = ((difference % 36_000_000) / 60_000) % 60 ;
        long hours = ((difference % 86_400_000) / 36_000_000) % 24;
        long days = ((difference / 86_400_000) % 30);
        long months = (((difference / 86_400_000) / 61 ) / 2 ) % 12;
        long years = (difference / 86_400_000) / 365;

        System.out.printf("Вам виповнилося %d років, %d місяці, %d днів, %d години, %d хвилин та %d секунд",
                years, months, days, hours, minutes, seconds);
    }
}

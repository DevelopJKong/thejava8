package me.jeongkong.java8to11.lecture13;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws InterruptedException{
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.atZone(ZoneId.of("UTC")));

        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

    }

}

package me.jeongkong.java8to11.lecture12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws InterruptedException{

        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat();

        Calendar jeongbinBirthday = new GregorianCalendar(1993,Calendar.AUGUST,16);
        System.out.println(jeongbinBirthday);
        jeongbinBirthday.add(Calendar.DAY_OF_YEAR,1);
        System.out.println(jeongbinBirthday);


        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);




    }

}

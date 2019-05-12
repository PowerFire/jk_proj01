package com.rody.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        //Car car= new Car("AA-0001",System.currentTimeMillis());
        //car.setLeave(System.currentTimeMillis()+1000*60*60*2);

        LocalDateTime enter= LocalDateTime.of(2018,12,25,
                8,00,5);
        LocalDateTime leave= LocalDateTime.of(2018,12,25,
                15,8,5);
        //Car car= new Car("AA-0001",enter.atZone(ZoneId.systemDefault()).toEpochSecond());
        Car car= new Car("AA-0001",enter);
        car.setLeave(leave);
        System.out.println(car.getDuraion());

        long hours= (long)Math.ceil(car.getDuraion()/60.0);
        System.out.println(hours+"\thours");


//        javaOldDate();
//        java8NewDate();

    }

    private static void java8NewDate() {
        // Java 8
        Instant instant= Instant.now();
        System.out.println(instant);
        //Local
        LocalDateTime nowTime= LocalDateTime.now();
        System.out.println(nowTime);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(nowTime));
        LocalDateTime newNowTime=nowTime.plus(Duration.ofHours(3));
        System.out.println(newNowTime);
        LocalDateTime otherTime=LocalDateTime.of(2018,11,23,0,0,0);
        System.out.println(otherTime);
    }

    private static void javaOldDate() {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));

        String s_date="2018/11/25 08:00:00";
        Date other_date=null;
        try {
            other_date=sdf.parse(s_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println((other_date));

        Calendar calendar= Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,5);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.DATE,5);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}

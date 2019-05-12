package com.rody.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
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

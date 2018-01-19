package com.cl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RestDays {
    public static void main(String[] args) {
        String s = "2018-1-02";
        System.out.println(60L-RestDays.restDaysGet(s));
    }
    public static long restDaysGet(String str){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        Date now = new Date();
        try {
            date1=format.parse(str);
           return ((now.getTime()-date1.getTime())/(3600*24*1000));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

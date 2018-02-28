package com.algorithms.leetcode;


import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    Calendar now = Calendar.getInstance();
    System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-"
        + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));

    String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
        "Friday", "Saturday" };
    // Day_OF_WEEK starts from 1 while array index starts from 0
    System.out.println("Current day is : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
    
    Calendar cal = Calendar.getInstance();
    // You cannot use Date class to extract individual Date fields
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);      // 0 to 11
    int day = cal.get(Calendar.DAY_OF_MONTH);
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.DAY_OF_WEEK);
 
    System.out.printf("Now is %4d/%02d/%02d %02d:%02d:%02d\n",  // Pad with zero
        year, month+1, day, hour, minute, second);
  }
}

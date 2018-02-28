package com.algorithms.leetcode;

import java.util.Calendar;
import java.util.Scanner;


public class DateToDay {
	public static String getDay(String day, String month, String year) {
		int dd = Integer.parseInt(day);
		int mm = Integer.parseInt(month);
		int yy = Integer.parseInt(year);
		Calendar c = Calendar.getInstance();
        //c.setTime(day,month,year);
		c.set(yy, mm, dd);
        c.set(yy, mm, dd);
        int dat= c.get(Calendar.DAY_OF_WEEK)-4;
        String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
                "Friday", "Saturday" };
        int len= strDays.length;
        System.out.println(len);
        String sat= strDays[dat];
        return sat;
        
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		System.out.println(getDay(day, month, year));

	}

}

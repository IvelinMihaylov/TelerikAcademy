package Combinatorics.intermediate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessTheDate {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int year = Integer.parseInt(in.readLine());
    int month = Integer.parseInt(in.readLine());
    int day = Integer.parseInt(in.readLine());
    
    int daysInMonth = 0;
    int monthInYear = month - 1;
    if(month - 1 == 0)
	 monthInYear = 12;
    switch(monthInYear) {
	 case 1:
	   daysInMonth = 31;
	   break;
	 case 2:
	   if(year % 4 == 0 || year % 100 == 0 && year % 400 == 0)
		daysInMonth = 29;
	   else
		daysInMonth = 28;
	   break;
	 case 3:
	   daysInMonth = 31;
	   break;
	 case 4:
	   daysInMonth = 30;
	   break;
	 case 5:
	   daysInMonth = 31;
	   break;
	 case 6:
	   daysInMonth = 30;
	   break;
	 case 7:
	   daysInMonth = 31;
	   break;
	 case 8:
	   daysInMonth = 31;
	   break;
	 case 9:
	   daysInMonth = 30;
	   break;
	 case 10:
	   daysInMonth = 31;
	   break;
	 case 11:
	   daysInMonth = 30;
	   break;
	 case 12:
	   daysInMonth = 31;
	   break;
    }
    if(day == 1) {
	 day = daysInMonth;
	 if(month == 1) {
	   year--;
	   month = 12;
	 } else {
	   month--;
	 }
    } else {
	 day--;
    }
    switch(month) {
	 case 1:
	   System.out.println(day + "-" + "Jan" + "-" + year);
	   break;
	 case 2:
	   System.out.println(day + "-" + "Feb" + "-" + year);
	   break;
	 case 3:
	   System.out.println(day + "-" + "Mar" + "-" + year);
	   break;
	 case 4:
	   System.out.println(day + "-" + "Apr" + "-" + year);
	   break;
	 case 5:
	   System.out.println(day + "-" + "May" + "-" + year);
	   break;
	 case 6:
	   System.out.println(day + "-" + "Jun" + "-" + year);
	   break;
	 case 7:
	   System.out.println(day + "-" + "Jul" + "-" + year);
	   break;
	 case 8:
	   System.out.println(day + "-" + "Aug" + "-" + year);
	   break;
	 case 9:
	   System.out.println(day + "-" + "Sep" + "-" + year);
	   break;
	 case 10:
	   System.out.println(day + "-" + "Oct" + "-" + year);
	   break;
	 case 11:
	   System.out.println(day + "-" + "Nov" + "-" + year);
	   break;
	 case 12:
	   System.out.println(day + "-" + "Dec" + "-" + year);
	   break;
    }
  }
}

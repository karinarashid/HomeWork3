package API;

import java.util.Date;

public class MyDate {

	 private static void DateClass() {
	        System.out.println("Date Class example:\n");
	        //Date class
	        Date date = new Date();
	 
	        // display time and date using toString()
	        System.out.println("Today Date:"+date.toString());
	 
	        System.out.println("\n");
	    }
	 
	 public static void main(String[] args) {
		 DateClass();
	 }
	 }
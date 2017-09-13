
package com.miraclessoftwareprivatelaboratorieschapter3;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

//Alarm Clock Project
public class AlarmClock {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date=new Date();
		int month=cal.get(Calendar.DAY_OF_MONTH)+1;
		int year= cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(day);
		System.out.println(date);
		//System.out.println(month+","+year);
		//System.out.println(sdf.format(cal.getTime()));
		if((day==2)||(day==3)||(day==4)||(day==5)) {
			if(sdf.format(cal.getTime())=="5:00:00") {
				System.out.println("***********Alarm Ringing*******");
				System.out.println(month+","+year);
			}
		}
		if(day==6) {
			if(sdf.format(cal.getTime())=="4:00:00") {
				System.out.println("*********Alarm RInging*********");
				System.out.println(month+","+year);
			}
		}
		if((day==7)||(day==1)) {
			if(sdf.format(cal.getTime())=="7:00:00") {
				System.out.println("*********Alarm Ringing**********");
				System.out.println(month+","+year);
			}
		}
		
	}

}

package miracleslaboratories;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Alarm {
	
	public static void main(String[] args) {
		String[] national_Holidays = {"01/01/2018","14/01/2018","21/01/2018","26/01/2018","10/02/2018","13/02/2018","01/03/2018","02/03/2018","04/03/2018","20/03/2018","29/03/2018","30/03/2018","01/04/2018","13/04/2018","30/04/2018","07/05/2018","15/06/2018","21/07/2018","15/08/2018","24/08/2018","26/08/2018","02/10/2018","19/10/2018","24/10/2018","27/10/2018","07/11/2018","08/11/2018","13/11/2018","21/11/2018","23/11/2018","24/12/2018","25/12/2018"};
		Scanner input=new Scanner(System.in);
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		Date date=new Date();
		System.out.println(date);
		System.out.println("Enter check-in date (dd/mm/yyyy):");
		String cindate = input.nextLine();
		if(null != cindate && cindate.trim().length() > 0){
			try{
				Date date1 = myFormat.parse(cindate);
				cal.setTime(date1);
				int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
		    		System.out.println("USer Entered Date is " + date1);
		    		boolean flag = false;
		    		for(int i=0;(!flag) && (i<national_Holidays.length);i++) {
		    			/*Date tempDate = myFormat.parse(national_Holidays[i]);
		    			//int flag = date1.compareTo(tempDate);
		    			//if(0==flag)*/
		    			if(0 == date1.compareTo(myFormat.parse(national_Holidays[i]))){
		    				flag = true;
		    			}
		    		}
		    		if(flag) {
		    			System.out.println("You entered National Holiday!");
		    			alarmclock();
		    			}
		    		else {
		    			System.out.println("No national holiday");
		    			while(dayofweek==6) {
		    				fridayalarm();
		    			}
		    			if((dayofweek>1)&&(dayofweek<6)) 
		    				weekdayalarm();
		    			else
		    				weekendalarm();
		    		}	
		    }
		    catch(ParseException pe) {
		    		System.out.println("You entered wrong date. " + pe.getMessage());
		    }
		    
		}
		
		input.close();
	}
	public static void alarmclock() {
		LocalTime now = LocalTime.now();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE");
		LocalTime alarmNationalHoliday = LocalTime.parse("07:00");
		System.out.println("Alarm Timing is "+alarmNationalHoliday+" Am");
		if(now.equals(alarmNationalHoliday)) {
			System.out.println("*****Alarm Ringing*******");
			System.out.println("It's National Holiday");
			System.out.println("Today is "+sdf.format(now));
		}
	}
	public static void weekdayalarm() {
		LocalTime now = LocalTime.now();
		LocalTime alarmonweekday = LocalTime.parse("05:00");
		SimpleDateFormat sdf = new SimpleDateFormat("EEE");
		System.out.println("Alarm Timing is "+alarmonweekday+" Am");
		if(now.equals(alarmonweekday)) {
			System.out.println("*********Alarm Ringing**********");
			System.out.println("Today is "+sdf.format(now));
		}
		
	}
	public static void fridayalarm() {
		LocalTime now = LocalTime.now();
		LocalTime fridayalarm = LocalTime.parse("04:00");
		System.out.println("Alarm Timing is "+fridayalarm+" Am");
		if(now.equals(fridayalarm)) {
			System.out.println("***********Alarm Ringiing**********");
			System.out.println("Today is Friday meeting at 04:30 Am with client");
		}
	}
	public static void weekendalarm() {
		LocalTime now = LocalTime.now();
		LocalTime weekendalarm = LocalTime.parse("07:00");
		SimpleDateFormat sdf = new SimpleDateFormat("EEE");
		System.out.println("Today alarm timing is "+weekendalarm+" Am");
		if(now.equals(weekendalarm)) {
			System.out.println("*************Alarm Ringing**********");
			System.out.println("Today is "+sdf.format(now));
		}
	}
}

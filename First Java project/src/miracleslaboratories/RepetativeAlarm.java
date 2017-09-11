package miracleslaboratories;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

//Repetative Alarm
public class RepetativeAlarm {
	public static void main(String[] args) {
		repeatAlarm();
		
	}
	public static void repeatAlarm(){
		Calendar cal=Calendar.getInstance();
		LocalTime now= LocalTime.now();
		Date date = new Date();
		LocalTime limit=LocalTime.parse("06:00");
		LocalTime limit1=LocalTime.parse("06:30");
		LocalTime limit2=LocalTime.parse("07:00");
		LocalTime limit3=LocalTime.parse("07:30");
		LocalTime limit4=LocalTime.parse("09:30");
		LocalTime limit5=LocalTime.parse("14:00");
		LocalTime limit6=LocalTime.parse("14:30");
		LocalTime limit7=LocalTime.parse("19:00");
		LocalTime limit8=LocalTime.parse("20:30");
		LocalTime limit9=LocalTime.parse("22:00");
		LocalTime limit10=LocalTime.parse("22:30");
		int day=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(date);
		while((day>1)||(day<7)){
			if(now.isBefore(limit)) 
				System.out.println("Sleeping");
			while(now.equals(limit)) {
				System.out.println("               Wake Up");
				System.out.println("               Good Morning");
			}
			while(now.equals(limit1)||now.equals(limit2)) {
				System.out.println("*********Jogging***********");
			}	
			while(now.isAfter(limit2)){
				while(now.isBefore(limit3)) {
					System.out.println("Have Morining Tea");
				}
				while(now.isAfter(limit3)&&now.isBefore(limit4))
					System.out.println("Ready for the Office");
			}
			if(now.equals(limit4)||now.isAfter(limit4))
				System.out.println("Leave for the Office");
			while(now.isAfter(limit4)||now.equals(limit5)||now.isAfter(limit5));{
				System.out.println("Working at office");
			}
			
			while(now.isAfter(limit5)||(now.equals(limit6))) {
				System.out.println("Lunch Time");
			}
			while(now.equals(limit7))
				System.out.println("Tea time");
			
			if(now.isBefore(limit8)&&(now.isAfter(limit7)))
					System.out.println("Having Dinner");
				else
					System.out.println("Dinner preparing");
			if(now.equals(limit9)||now.isAfter(limit9)){
				if(now.isAfter(limit9)||now.isBefore(limit10)) 
					System.out.println("Time to sleep now");
				else
					System.out.println("You have to Sleep now");
			}
			if(now.isAfter(limit10))
				System.out.println("Sleep it's too late");
		}
		while((day==0)||(day==7)) {
			if(now.isBefore(limit1))
				System.out.println("Sleeping");
			while(now.equals(limit1)) {
				System.out.println("**********Wake Up**********");
				System.out.println("Good Morning");
			}
			while(now.equals(limit2)||now.equals(limit3)) {
				System.out.println("*********Jogging***********");
			}
			while(now.equals(limit3)||now.equals(limit4)) {
				System.out.println("Watching T.V with Tea");
			}
			while(now.equals(limit4)||now.isAfter(limit4)&&now.equals(limit5)||now.isBefore(limit5)) {
				System.out.println("House hold Work");
			}
			while(now.equals(limit5)||now.isAfter(limit5)&&now.equals(limit6)||now.isBefore(limit6)) {
				System.out.println("Lunch time");
			}
			while(now.isAfter(limit6)||now.isBefore(limit7)) {
				System.out.println("Sleeping");
			}
			while(now.equals(limit7)||now.isAfter(limit7)) {
				System.out.println("Having Tea");
			}
			while(now.isAfter(limit7)&&now.isBefore(limit9)) {
				System.out.println("Dinner with T.V");
			}
			if(now.isAfter(limit10))
				System.out.println("Sleeping Time"+"\nGoodNight");
		}
		
		
		
		
		
	}

}

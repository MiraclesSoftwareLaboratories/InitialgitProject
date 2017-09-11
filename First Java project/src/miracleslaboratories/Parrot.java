package miracleslaboratories;

import java.time.LocalTime;


//Parrot Problem
public class Parrot {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		LocalTime limit=LocalTime.parse("07:00");
		LocalTime limit2=LocalTime.parse("20:00");
		if((now.isBefore(limit))||(now.isAfter(limit2))) {
			System.out.println("TROUBLE");
		}
		else {
			System.out.println("NO TROUBLE");
		}
		
		
		
	}

}

package com.miraclessoftwareprivatelaboratorieschapter3;
import java.lang.ArithmeticException;
//Exception Handling
public class ExceptionHandling {
	public static void main(String[] args) {
		exception();
		System.out.println("Inside Main Block Now");
	}
	public static void exception(){
		try {
			int obj1,obj2;
			obj1=7;
			obj2=0;
			int obj3=obj1/obj2;
			System.out.println(obj3);
		}
		catch (ArithmeticException e) {
			System.out.println("Arthmatic Exception");
		}
		
	}

}

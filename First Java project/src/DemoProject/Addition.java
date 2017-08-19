package DemoProject;
import java.util.Scanner;   //import java util Scanner
public class Addition {
public static void main(String[] args) {			
	int val1,val2,val3=0;		//initialization of variables
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the two numbers :");
	val1=s.nextInt();		//Taking first input variable
	val2=s.nextInt();		//Taking second input variable
	val3=val1+val2;			//Addition in the third variable
	System.out.println("Sum:" +val3);	//printing the output 
	int vala,valb,valc=0;		//initialization of variables
	//Scanner j=new Scanner(System.in);
	System.out.println("Please enter two numbers to be subtracted");
	vala=s.nextInt();		//Taking first input
	valb=s.nextInt();		//Taking second input
	valc=vala-valb;			//Calculating the result
	System.out.println("Subtraction:"+valc);		//printing the output
	int w,x,y,z=0;			//initialization of variables
	//Scanner l=new Scanner(System.in);
	System.out.println("Please enter three numbers");
	w=s.nextInt();			//Taking first input 
	x=s.nextInt();			//Taking second input
	y=s.nextInt();			//Taking third input
	z=w+x+y;					//Calculating the result
	System.out.println("Sum:"+z);	//Printing the output
	s.close();
	
}
}

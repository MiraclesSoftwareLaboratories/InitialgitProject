package chapter2;
//Increment in Constructor
public class Frog {
	static int FrogCount=0;
	public Frog() {
		FrogCount +=1;
	}
	public static void main(String[] args) {
		new Frog();
		new Frog();
		new Frog();
		System.out.println("Frog Count is now "+FrogCount);
	}
}

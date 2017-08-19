package chapter2;
//Static Method and Variable
public class StaticVariableMethod {
	static int frogCount=0;
	public void Frog() {
		frogCount +=1;
	}
	public static void main(String[] args) {
		StaticVariableMethod obj = new StaticVariableMethod();
		obj.Frog();
		obj.Frog();
		obj.Frog();
		System.out.println("The value is "+frogCount);
	}
}

package DemoProject;
//Implementation of Protected method and variables
public class Protected {
	protected int speed=20;
	protected void fun() {
		System.out.println("Having Fun");
		speed= 40;
	}
}
class Extend extends Protected{
	
	/*public static void main(String[] args) {
		Protected obj=new Protected();
		obj.fun();*/
	//}
}
class Variable extends Extend{
	Extend obj1=new Extend();
	protected void fun(Extend obj) {
		System.out.println(speed);
	}
	/*public static void main(String[] args) {
		Extend obj=new Extend();
		obj.fun();*/
	//}
}
class Fun{
	Protected obj=new Protected();
	/*protected void fun() {
		System.out.println(speed);
	}*/
	public static void main(String[] args) {
	Extend obj=new Extend();
	obj.fun();
}
}

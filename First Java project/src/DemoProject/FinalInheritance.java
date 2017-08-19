package DemoProject;
//Final Method Inheritance class
public class FinalInheritance {
	final void run() {
		System.out.println("Final Method Inheritance");
	}
	void play() {
		System.out.println("Hello");
		//short a= 32768;
	}
}
class Regular extends FinalInheritance{
	void run() {
		System.out.println("hoo");
	}
}

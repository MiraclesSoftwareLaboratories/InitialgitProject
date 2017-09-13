package DemoProject;
//Final Method can't be override
public class FinalMethod {
	final void run() {
		System.out.println("Running");
	}
	class Amit extends FinalMethod{
	//	void run() {
	//		System.out.println("Running safely with 100km");
	//	}
	//	public static void main(String[] args) {
			Amit obj1= new Amit();
	//		obj1.run();
	//	}
	}
}
	


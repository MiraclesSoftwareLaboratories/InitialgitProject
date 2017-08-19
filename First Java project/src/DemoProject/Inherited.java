package DemoProject;
//Final method is inherited in the class
public class Inherited extends FinalInheritance{
	public static void main(String[] args) {
		new Inherited().run();
		FinalInheritance obj= new FinalInheritance();
		System.out.println("Inherited method is done");
		
	}
	@Override
	void play() {
		System.out.println("Welcome");
	}
}

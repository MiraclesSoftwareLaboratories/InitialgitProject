package DemoProject;

public class AccessModifiers {
	
	class First{
		public String coolMethod() {
			return "You are in Method 1";
		}
	}
	class Second{
			public void useAFirst() {
				First variable = new First();
				System.out.println(variable.coolMethod());
			}
	}
	class Parent{
		private int Method1() {		//Private method
			return 5;
			//System.out.println("Privater method");
		}
	}
	class Child{
		public void useAParent() {
			Parent var = new Parent();
			System.out.println(var.Method1());	//Accessing the private method
		}
	}
	private String accessModifiresName;      //Instance variable
	public AccessModifiers(String name) {	//Parameterized constructor
		accessModifiresName=name;			//Initializing constructor variable
	}
	public String getAccessModifiersName() {
		return getAccessModifiersName();
	}
	public void setAccessModifiersName(String name) {
		accessModifiresName=name;
	}
	public static void main(String[] args) {
		AccessModifiers obj1 = new AccessModifiers("Amit");
		System.out.println(obj1.accessModifiresName);
	}
}

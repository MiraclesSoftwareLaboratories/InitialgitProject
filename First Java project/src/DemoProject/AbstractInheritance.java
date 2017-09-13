package DemoProject;

public class AbstractInheritance extends AbstractClassExample {
	private int AbstractInheritanceClass;
	public AbstractInheritance(String Name, String Section, int Percent, int Class) {
		super(Name,Section,Percent);
		AbstractInheritanceClass = Class;
		//setAbstractInheritance();
	}
	public String getAbstractClassExampleName() {
		return "Amit";
	}
	public int getAbstractInheritanceClass() {
		return AbstractInheritanceClass;
	}
	public void setAbstractInheritanceClass(int Class) {
		AbstractInheritanceClass=Class;
	}
	public int getAbstractClassExample() {
		System.out.println("HelloWorld");
		return 0;
	}
	public int Hello() {					//Abstract method
		System.out.println("Welcome");  
		return 0;
	}
	public static void main(String[] args) {
		AbstractInheritance abs1= new AbstractInheritance("Rahul","A",71,10);
		//AbstractClassExample obj2= new AbstractClassExample("Amit","C",67,5);
		System.out.println("Hey you there");
		abs1.getAbstractClassExampleName();
		//obj2.getAbstractClassExampleName();
		System.out.println("Byee!!!");
		
		
	}
}
	
		

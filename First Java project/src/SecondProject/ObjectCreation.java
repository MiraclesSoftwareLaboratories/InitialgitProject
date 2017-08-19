package SecondProject;

import DemoProject.OOP;
import DemoProject.OOP2;
import DemoProject.Protected;

public class ObjectCreation {
	public static void main(String[] args) {
	Protected obj=new Protected();
	obj.fun();
	}
	public void method() {
		OOP obj= new OOP();
		obj.testIt();
		System.out.println(testIt());
	}
	}
class ObjectMaking extends OOP2{
	public void method2() {
		System.out.println(doTest());
	}
}
	



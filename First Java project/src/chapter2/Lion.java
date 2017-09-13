package chapter2;
//Polymorphism in overloaded and overridden method
public class Lion extends Animal{
	public void eat() {
		System.out.println("Inside eat method of lion overridden method");
	}
	public void eat(String s) {
		System.out.println("Inside eat method of lion overloaded method");
	}
}
class Animal{
	public void eat() {
		System.out.println("Inside eat method of Animal");
	}
	Lion obj = new Lion();
	public static void main(String[] args) {
	//int result=obj.eat();
	//System.out.println(result);
	//int value=obj.eat(a);
	//System.out.println(value);
		
	}
}

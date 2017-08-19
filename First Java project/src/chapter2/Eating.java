package chapter2;
//Overriding a method
public class Eating {
	public static void main(String[] args) {
		Horse hr= new Horse();
		Horse dg = new Dog();
		hr.eat();
		dg.eat();
	}
}
class Horse{
	public void eat() {
		System.out.println("Horse eat hay");
	}
}
class Dog extends Horse{
	//Override
	public void eat() {
		System.out.println("Dog eat veg and non veg");
	}
}

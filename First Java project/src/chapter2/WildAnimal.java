package chapter2;
//Super Class Invoke overridden method
public class WildAnimal {
	public static void main(String[] args) {
		Doggie obj = new Doggie();
		Doggie obj2 = new Cow();
		obj.play();
		obj2.play();
	}
}
class Doggie{
	public void play() {
		System.out.println("Dog playing");
	}
}
class Cow extends Doggie{
	public void play() {
		System.out.println("Cow playing");
		super.play();
		System.out.println("Dog play with ball");
	}
}

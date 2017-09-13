package chapter2;
//Question 13
public class ZooKeeper {
	public static void main(String[] args) {
		//new Zookeeper().go();
	}
	void go() {
		Mammal m = new Zebra();
		System.out.println(m.name + m.makeNoise());
	}
}
class Mammal{
	String name = "Fury";
	String makeNoise() {
		return "generic noise";
	}
}
class Zebra extends Mammal{
	String name= "Stripes";
	String makeNoise() {
		return "bray";
	}
}
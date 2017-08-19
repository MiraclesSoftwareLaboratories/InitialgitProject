package chapter2;
//Question 10
public class Tenor extends Singer{
	public static String sing() {
		return "fa";
	}
	public static void main(String[] args) {
		Tenor obj = new Tenor();
		Singer obj2 = new Tenor();
		System.out.println(obj.sing() + " " + obj2.sing());
	}
}
class Singer{
	public static String sing() {
		return "la";
	}
}

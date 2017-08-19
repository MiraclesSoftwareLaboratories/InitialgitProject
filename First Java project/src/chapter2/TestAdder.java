package chapter2;
//Overloaded method
public class TestAdder {
	public static void main(String[] args) {
		Adder adj = new Adder();
		Divisor dj = new Divisor();
		int b = 23;
		int c = 14;
		int result = adj.addthem(b, c);
		double doubleresult = dj.addtem(b, c);
		System.out.println(result);
		System.out.println(doubleresult);
	}
}
class Adder{
	public int addthem(int x, int y) {
		return x+y;
	}
}
class Divisor{
	public double addtem(double x, double y) {
		return x/y;
	}
}
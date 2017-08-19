package chapter2;
//Question 11
public class SubSubAlpha extends Alpha{
	private SubSubAlpha() {
		s += "SubSub";
	}
	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}
class SubAlpha extends Alpha{
	private SubAlpha() {
		s += "sub ";
	}
}
class Alpha{
	Static String s= "";
	protected Alpha() {
		s += "alpha ";
	}
}

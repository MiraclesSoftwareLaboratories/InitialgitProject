package DemoProject;
//Final class can't be extended
public final class Example {
	void run() {
		System.out.println("Running at low speed");
	}
}
class Base {
	int run() {
		System.out.println("Running at high speed");
		return 0;
		}
	public static void main(String[] args) {
		Base obj= new Base();
		System.out.println(obj.run());
	}
}

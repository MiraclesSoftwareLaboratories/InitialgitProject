package DemoProject;
//Value of the final variable never be changed after assign a value
public class Final {
	final int SPEED_LIMIT=90;
	void run() {
		System.out.println(SPEED_LIMIT);
		SPEED_LIMIT=40;
	}
	void calculate(final int no, int count) {
		count = 5;
	
	}
public static void main(String[] args) {
	final Final obj= new Final();
	obj.run();
	obj.calculate(10, 2);
	obj.calculate(13,3);
}

}

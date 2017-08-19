package chapter2;
//Question 6
public class Chrome {
	public static void main(String[] args) {
		X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        /*int a=x1.do1();
        int b=x2.do1();
        int c=y1.do2();
        */
        //System.out.println(""+a,+c,+b);
	}
}

class X { 
	int do1() {
	System.out.println("Inside Class X");
	return 0;
	} 
}
class Y extends X {
	int do2() {
		System.out.println("Inside Class Y");
		return 0;
	} 
}

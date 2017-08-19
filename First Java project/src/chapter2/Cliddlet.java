package chapter2;
//Question 3
public class Cliddlet extends Clidder{
	public final void flipper() { System.out.println("Clidlet");  }
    public static void main(String [] args) {
      new Cliddlet().flipper();
    }
}
class Clidder {
    private final void flipper() { 
    	System.out.println("Clidder"); 
    	}
}

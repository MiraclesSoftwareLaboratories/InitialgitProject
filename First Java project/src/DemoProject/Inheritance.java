package DemoProject;

public class Inheritance {
	
	class Forest {
		public String bestMethod() {
			return "Hello";
		}
	}
	class Zoo extends Forest {
		public void useMyBestMethod() {
			System.out.println(this.bestMethod());
			Forest var1 = new Forest();
			System.out.println(var1.bestMethod());
		}
	}

}

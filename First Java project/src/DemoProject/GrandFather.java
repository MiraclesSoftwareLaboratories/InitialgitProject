package DemoProject;

public class GrandFather {
	public String grandFatherName;
	public GrandFather() {
	}
	public GrandFather(String name) {
		grandFatherName = name;
	}
	public String getGrandFatherName(){
		return grandFatherName;
	}
	public void setGrandFatherName(String name) {
		grandFatherName=name;
	}
}
	class Father extends GrandFather{
		private String fatherName;
		public Father(String name) {
			fatherName=name;
		}
		public String getFatherName() {
			return fatherName;
		}
		public void setFatherName(String name) {
			fatherName=name;
		}
		public void firstmethod() {
			GrandFather obj1 = new GrandFather("Amit");
			System.out.println(obj1.grandFatherName);
			System.out.println("Hello");
		}
	}
	class Child extends Father{
		public void secondmethod() {
			GrandFather obj2 = new GrandFather();
			Father obj3 = new Father("Hello");
			System.out.println(obj2.grandFatherName);
			System.out.println(obj3);	
		}
	class GrandChilderen extends Child{
		public void thirdmethod() {
			GrandFather obj4 = new GrandFather();
			Father obj5 = new Father("Hii");
			Child obj6 = new Child();
			System.out.println(obj4);
			System.out.println(obj5);
			System.out.println(obj6);
		}
	}
		
	}
		
		



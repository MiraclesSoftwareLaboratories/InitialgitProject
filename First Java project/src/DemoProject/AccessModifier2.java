package DemoProject;

public class AccessModifier2 {
	private String accessModifier2Name;
	private int accessModifier2Birth;
	public AccessModifier2(String name,int birth) {
		accessModifier2Name=name;
		accessModifier2Birth=birth;
	}
	private String getAccessModifier2Name() {
		return accessModifier2Name;
	}
	private int getAccessModifier2Birth() {
		return accessModifier2Birth;
	}
	private void setAccessModifier2Name(String name) {
		accessModifier2Name=name;
	}
	private void setAccessModifier2Birth(int birth) {
		accessModifier2Birth=birth;
	}
}
class Test{

	public static void main(String[] args) {
		AccessModifier2 obj=new AccessModifier2("Amit",23);
		//System.out.println(obj.accessModifier2Name);
		//System.out.println(obj.accessModifier2Birth);
	}
	
	
}

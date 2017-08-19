package DemoProject;

public class ObjectImplementation {
	private String objectImplementationName; //Instance variable
	private int objectImplementationAge;
	private int objectImplementationHeight;
	private int objectImplementationWeight;
	public ObjectImplementation() {
	}
	public ObjectImplementation(String name,int age,int height,int weight ) {
		objectImplementationName=name;
		objectImplementationAge=age;
		objectImplementationHeight=height;
		objectImplementationWeight=weight;
	}
	public String getObjectImplementationName() {
		return objectImplementationName;
	}
	public int getObjectImplementationAge() {
		return objectImplementationAge;
	}
	public int getObjectImplementationHeight() {
		return objectImplementationHeight;
	}
	public int getObjectImplementationWeight() {
		return objectImplementationWeight;
	}
	public void setObjectImplementationName(String name) {
		objectImplementationName=name;
	}
	public void setObjectImplementationAge(int age) {
		objectImplementationAge=age;
	}
	public void setObjectImplementationHeight(int height) {
		objectImplementationHeight=height;
	}
	public void setObjectImplementationWeight(int weight) {
		objectImplementationWeight=weight;
	}
	public static void main(String[] args) {
		ObjectImplementation obj1 = new ObjectImplementation();
		obj1.setObjectImplementationName("Tarzon");
		obj1.setObjectImplementationAge(24);
		obj1.setObjectImplementationHeight(192);
		obj1.setObjectImplementationWeight(74);
		System.out.println("Name is:"+obj1.getObjectImplementationName());
		System.out.println("Age is"+obj1.getObjectImplementationAge());
		System.out.println("Height is in cm:"+obj1.getObjectImplementationHeight());
		System.out.println("Weight is in Kg:"+obj1.getObjectImplementationWeight());
		
		ObjectImplementation obj2 = new ObjectImplementation("Amit",12,178,67);
		System.out.println(obj2.objectImplementationName);
		
	}
}

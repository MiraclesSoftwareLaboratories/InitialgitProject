package DemoProject;

public class MyObject {
	private int myObjectNo;
	private String myObjectName;
	public MyObject() {
		}
	public MyObject(int no, String name) {
		myObjectNo=no;
		myObjectName=name;
		}
	public int getMyObjectNo() {
		return myObjectNo;
	}
	public String getMyObjectName() {
		return myObjectName;
	}
	public void setMyObjectNo(int no) {
		myObjectNo=no;
	}
	public void setMyObjectName(String name) {
		myObjectName=name;
	}
	public static void main(String[] args) {
		MyObject obj1= new MyObject();	//Making object 
		obj1.setMyObjectNo(2);
		obj1.setMyObjectName("Tommy");
		System.out.println("Obj1 NO:" +obj1.getMyObjectNo());
		System.out.println("Obj1 Name:"+obj1.getMyObjectName());
	}
}

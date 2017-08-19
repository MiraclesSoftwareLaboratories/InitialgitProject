package com.miracles.july13;
//Using (this) in the instance variable
public class InstanceVariable {

}
class foo{
	static int size=27;
	public static void main(String[] args) {
		//setsize(2);
		System.out.println(size);	
	}
	public void setsize(int size) {
		size=size;
	}
}
//want to know how can i print the value of size




class foo1{
	int val=2;
	public void setsize(int val) {
		this.val=val;
		System.out.println(val);
	}
}
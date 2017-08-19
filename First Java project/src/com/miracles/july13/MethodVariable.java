package com.miracles.july13;
//Referring local variable outside its method
public class MethodVariable {
	int var1=4;
	public void first() {
		int count=1;
		System.out.println("Value for count is"+count);
	}
	public void Second(int i) {
		//count=i;
	}

}
class TestServer {
    int count = 9;  // Declare an instance variable named count
    public void logIn() {
       int count = 10;  // Declare a local variable named count
       System.out.println("local variable count is " + count);
    }
    public void count() {
       System.out.println("instance variable count is " + count);
    }
    public static void main(String[] args) {
        new TestServer().logIn();
        new TestServer().count();
     }
}
    

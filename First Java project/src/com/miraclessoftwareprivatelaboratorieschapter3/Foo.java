package com.miraclessoftwareprivatelaboratorieschapter3;
//Reference variable assignment
public class Foo {
	public void doStuff() {
	}
}
class Bar extends Foo{
	public void doStuff() {
	}
}
class Test{
	public static void main(String[] args) {
		Foo reallyABar = new Bar();
		//Bar reallyAFoo = new Foo();
	}
}
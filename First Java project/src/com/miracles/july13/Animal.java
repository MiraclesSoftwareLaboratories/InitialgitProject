package com.miracles.july13;
//Abstract class method implementation
public abstract class Animal {
	public abstract void eat();
	public String walk() {
		System.out.println("Inside Walk method");
		return "Walk";
	}
}
abstract class BigAnimal extends Animal{
	public abstract void eat();
	public void run() {
		System.out.println("Inside animal run method");
	}
}
class Mamal extends BigAnimal{
	public void eat() {
		System.out.println("Abstract method eat");
	}
}

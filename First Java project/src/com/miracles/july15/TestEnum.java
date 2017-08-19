package com.miracles.july15;
//Applying Enums
 enum TestEnum_a {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	TestEnum_a(String s) { 
		sound = s; 
		}
}
	class TestEnum {
		static TestEnum_a a;
		public static void main(String[] args) {
		        System.out.println(TestEnum_a.DOG.sound + " " + TestEnum_a.FISH.sound);
		        TestEnum_a.values()
	}
}


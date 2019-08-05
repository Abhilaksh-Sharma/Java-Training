package com.java.interface_code;

public class TestClass {
	
	final static int var1;
	final String var2;
	final float var3;
	
	//String var4 = "FOUR";
	
	String var4 = "Four";
	
	//Static Block
	static{
		var1 = 1;
		System.out.println("Static block initialized with var1 : " + var1);
	}
	
	//Instance Initializer Block
	{
		var2 = "TWO";
		System.out.println("Instance Initializer block initialized with var2 : " + var2);
	}
	
	//Constructor
	public TestClass(){
		var3 = 3f;
		System.out.println("Constructor initialized with var3 : " + var3);
	}
	
	public static void main(String[] args) {
		//Anonymous Object
		//new TestClass();
		
		A obj = new B();
		//obj.method1();//Class A or Class B
		obj.method2();
		
		B objB = new B();
		//objB.method1();//Class B
		obj.method2();
	}

}


class A{
	
	static void method1() {
		System.out.println("Class A static method");
	}
	
	 void method2() {
		System.out.println("Class A static method");
	}
}


class B extends A{
	static void method1() {
		System.out.println("Class B static method");
	}
	
	void method2() {
		System.out.println("Class B static method");
	}
}
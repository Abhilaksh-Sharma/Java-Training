package com.java.interface_code;

interface TestInterface123 {
	
	
	//Constructors
	/*
	 * public TestInterface() {
	 * 
	 * }
	 */
	 
	
	//Fields
	int var1 = 1;
	
	String var2 = "TWO";
	
	float var3 = 3f;
	
	
	//Methods
	void method1();
	
	public int method2();
	
	abstract String method3();
	
	
	//Default Methods
	default void defaultMethod1() {
		//System.out.println(var1);
		System.out.println("Default Method 1 invoked");
	}
	
	default void defaultMethod2() {
		System.out.println("Default Method 2 invoked");
	}
	
	default void defaultMethod3() {
		System.out.println("Default Method 3 invoked");
	}
	
	
	//Static Methods
	static void staticMethod1() {
		System.out.println("Static Method 1 invoked");
	}
	
	static void staticMethod2() {
		System.out.println("Static Method 2 invoked");
	}
	
	static void staticMethod3() {
		System.out.println("Static Method 3 invoked");
	}
	
}

public class TestImpl123 implements TestInterface123{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String method3() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void defaultMethod3() {
		System.out.println("Default Method 3 of Sub-Class invoked");
	}
	
	
	public static void main(String[] args) {
		
		TestImpl123 obj = new TestImpl123();
		
		obj.defaultMethod1();
		
		TestImpl123 TestImpl=new TestImpl123();
		TestImpl.defaultMethod3();
		
	}
}

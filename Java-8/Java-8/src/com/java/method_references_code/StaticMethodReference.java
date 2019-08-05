package com.java.method_references_code;

public class StaticMethodReference {
	public static int staticMethod() {
		System.out.println("Static Method of StaticMethodReference invoked");
		return 10;
	}

	public static void main(String[] args) {

		MyFunctionalInterface myFunctionalInterface = StaticMethodReference::staticMethod;
		myFunctionalInterface.abstractMethod();

		A objA = new A();
		objA.method1();
		objA.method2();

		// Upcasting
		A obj = new B();
		obj.method1();
		obj.method2();

		// Downcasting
		B objB = (B) objA;
		objB.method1();
		obj.method2();

	}
}

class A {

	static void method1() {
		System.out.println("Class A static method");
	}

	void method2() {
		System.out.println("Simple method of class A");
	}
}

class B extends A {
	static void method1() {
		System.out.println("Class B static method");
	}

	void method2() {
		System.out.println("Simple method of class B");
	}
}
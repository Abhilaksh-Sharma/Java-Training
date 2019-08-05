package com.java.functional_interface_code;

@FunctionalInterface
public interface TestFunctionalInterface {
	
	void method1();
	
	//void method2();

	  // Default Methods default 
	default void defaultMethod1() {
	  System.out.println("Default Method 1 invoked"); 
	  }
	  
	  default void defaultMethod2() {
	  System.out.println("Default Method 2 invoked"); }
	  
	  default void defaultMethod3() {
	  System.out.println("Default Method 3 invoked"); }
	  
	  // Static Methods 
	  static void staticMethod1() {
	  System.out.println("Static Method 1 invoked"); }
	  
	  static void staticMethod2() { System.out.println("Static Method 2 invoked");
	  }
	  
	  static void staticMethod3() { System.out.println("Static Method 3 invoked");
	  }
	 
	
	
	  //Object Class toString & equals method
	  
	  @Override 
	  String toString();
	  
	  @Override boolean equals(Object obj);
	 
}

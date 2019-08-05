package com.java.method_references_code;

public class InstanceMethodReference {
	
	public void instanceMethod() {
		System.out.println("Instance Method of InstanceMethodReference invoked");
	}

	public static void main(String[] args) {
		
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		
		MyFunctionalInterface myFunctionalInterface = new InstanceMethodReference()::instanceMethod;
		myFunctionalInterface.abstractMethod();
	}
}

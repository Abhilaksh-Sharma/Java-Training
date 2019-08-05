package com.java.lambda_expression_code;


public class FunctionalInterfaceImpl implements FunctionalInterface{

	@Override
	public void abstractMethod() {
		System.out.println("Abstract Method ivoked using Sub-Class Implementation");
	}
	
	public static void main(String[] args) {
		//Invoking Abstract Method of FunctionalInterface by implementing it in Sub-Class
		FunctionalInterface functionalInterface  = new FunctionalInterfaceImpl();
		functionalInterface.abstractMethod();
	}
	
}

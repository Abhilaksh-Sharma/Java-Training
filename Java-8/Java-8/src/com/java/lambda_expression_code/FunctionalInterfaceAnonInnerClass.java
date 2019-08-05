package com.java.lambda_expression_code;

public class FunctionalInterfaceAnonInnerClass {
	
	public static void main(String[] args) {
		FunctionalInterface functionalInterface = new FunctionalInterface() {
			@Override
			public void abstractMethod() {
				System.out.println("Abstract Method ivoked using Anonymous Inner Class");
			}
		};
		
		FunctionalInterface functionalInterface2 = new FunctionalInterface() {
			@Override
			public void abstractMethod() {
				System.out.println("Abstract Method ivoked using Anonymous Inner Class 2");
			}
		};
		
		functionalInterface.abstractMethod();
		
		functionalInterface2.abstractMethod();
		
		
		
		/*
		 * FunctionalInterfaceAnonInnerClass obj = new
		 * FunctionalInterfaceAnonInnerClass();
		 * 
		 * new FunctionalInterfaceAnonInnerClass();
		 */
		
		
	}
}

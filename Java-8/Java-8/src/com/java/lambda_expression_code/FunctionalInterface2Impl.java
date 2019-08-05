package com.java.lambda_expression_code;

public class FunctionalInterface2Impl {

	public static void main(String[] args) {
		
		FunctionalInterface2 functionalInterface2Obj1 = (a,b)->{return a+b;};
		
		FunctionalInterface2 functionalInterface2Obj2 = (int a, int b)->{return a+b;};
		
		FunctionalInterface2 functionalInterface2Obj3 = (a,b)->a+b;
		
		System.out.println(functionalInterface2Obj1.add(10, 20));
	}

}

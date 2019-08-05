package com.java.lambda_expression_code;

public class FunctionalInterfaceLambdaExpression {
	
	public static void main(String[] args) {
		
		FunctionalInterface functionInterface = () ->
			{
				System.out.println("Abstract method implemented using lambda expression");
			};
			
			
			functionInterface.abstractMethod();
			
			//()->{}
			
			
		Thread thread = new Thread(()->{System.out.println("Run method of Runnable Interfcae implemented using Lambda Expression");});
		thread.start();
	}
}

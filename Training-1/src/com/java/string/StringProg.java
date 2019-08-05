package com.java.string;

public class StringProg {
	
	public static void main(String[] args) {
		
		String string = "abc";
		String string1 = new String(string);		
		String string2 = "def";
		String string3 = new String(string1);
		String string4 = "def";
		String string5 = string3.intern();
		String string6 = new String("abc");
		
		//Predict the output (true/false)
//		System.out.println(string==string1);//false
//		System.out.println(string1==string3);//Error//false
//		System.out.println(string==string6);//false
//		System.out.println(string==string5);//false
//		System.out.println(string4==string2);//true
//		
		//Predict the output
		String test = "Welcome";
		test.concat(" Class");
		System.out.println("Test String : " + test);//Test String : Welcome Class
		test = test.concat("Class");
		System.out.println("Test String : " + test);//Test String Welcome Class Class
		
		
	}
}

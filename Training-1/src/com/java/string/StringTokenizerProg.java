package com.java.string;

import java.util.StringTokenizer;

public class StringTokenizerProg {
	public static void main(String[] args) {
		StringTokenizer stringTokenizer = new StringTokenizer("abc#def#hij", "#");
		System.out.println("Count of Tokens : " + stringTokenizer.countTokens());

		while (stringTokenizer.hasMoreTokens()) {
			System.out.println("Token : " + stringTokenizer.nextToken());
		}

		//StringTokenizer class implements Enumeration interface hence they exists
		//Works same as hasMoreTokens() & nextToken() methods mentioned above
		while (stringTokenizer.hasMoreElements()) {
			System.out.println("Element : " + stringTokenizer.nextElement());
		}
	}

}

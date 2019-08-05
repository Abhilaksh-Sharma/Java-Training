package com.java.method_references_code;

interface ConstructorReferenceInterface{
	ConstructorReference abstractMethod();
}

public class ConstructorReference {
	public ConstructorReference() {
		System.out.println("hello World!");
	}
	
	public static void main(String[] args) {
		ConstructorReferenceInterface onstructorReferenceInterface = ConstructorReference::new;
		onstructorReferenceInterface.abstractMethod();
	}
}

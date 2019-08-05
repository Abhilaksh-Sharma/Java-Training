package com.java.generics;

//A Simple Java program to show multiple 
//type parameters in Java Generics 

//We use < > to specify Parameter type 
class Test<T, U> {
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	Test(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print() {
		System.out.println("Object1 : " + obj1);
		System.out.println("Object2 : " + obj2);
	}
	
	// A Generic method example 
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + 
                           " = " + element); 
    } 
}

//Driver class to test above 
class GenericsProg {
	public static void main(String[] args) {
		Test<String, Integer> obj = new Test<String, Integer>("GfG", 15);
		//Call print() method
		obj.print();
		
		// Calling generic method with Integer argument 
		obj.genericDisplay(11); 
   
        // Calling generic method with String argument 
		obj.genericDisplay("GeeksForGeeks"); 
   
        // Calling generic method with double argument 
		obj.genericDisplay(1.0);
		
		
	}
}

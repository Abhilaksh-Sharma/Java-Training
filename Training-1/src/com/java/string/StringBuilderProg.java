package com.java.string;

public class StringBuilderProg {
	
	public static void addChar(StringBuilder strBuilder) {
        /*
         * Here appended 6 A and removed 5 A at each call to this method. Total
         * 1 A at each call Expected Accurate Total StringBuilder length = loops
         * in run method * 1 i.e. 500 * 1 for one thread Here we have 2
         * threads so = 1000
         */
 
        try {
            strBuilder.append("A");
            strBuilder.append("A");
            strBuilder.append("A");
            strBuilder.deleteCharAt(0);
            strBuilder.append("A");
            strBuilder.append("A");
            strBuilder.append("A");
            for (int i = 0; i < 4; i++) {
                strBuilder.deleteCharAt(0);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A wasn't at index 0 " + e.getMessage());
        }
    }
	
	
	public static void main(String[] args) {

//		StringBuilder stringBuilder = new StringBuilder("HelloWorld!");
//
//		// Methods
//
//		// Amount of storage available for newly inserted characters
//		System.out.println("StringBuilder Caapcity : " + stringBuilder.capacity());
//
//		// Traversal
//		for (int i = 0; i < stringBuilder.length(); i++) {
//			System.out.println("Character @ " + (i + 1) + " location : " + stringBuilder.charAt(i));
//		}
//
//		// If currCapacity<givenCapacity then currCapacity = currCapacity*2 + 2
//		stringBuilder.ensureCapacity(50);
//
//		System.out.println("Appending String : " + stringBuilder.append(" is the best example!"));
//
//		System.out.println("Index of 'Hello' : " + stringBuilder.indexOf("Hello"));
//
//		System.out.println("Index of 'Hello' : " + stringBuilder.lastIndexOf("Hello"));
//
//		System.out.println("Index of 'e' : " + stringBuilder.indexOf("e", 10));
//
//		System.out.println("Index of 'e' : " + stringBuilder.lastIndexOf("e", 10));
//
//		stringBuilder.setLength(11);
//		System.out.println("Setting length for StringBuilder : " + stringBuilder);
//
//		System.out.println(
//				"Replacing operation on StringBuilder : " + stringBuilder.replace(10, stringBuilder.length(), ""));
//
//		System.out.println("Reversing StringBuilder : " + stringBuilder.reverse());
		
		//Creates an empty instance of StringBuilder
		StringBuilder str = new StringBuilder();

		// Thread-Safety
		Thread thread1 = new Thread(() -> {
			// Append "#" at the end of stringBuilder
			for (int i = 0; i < 500; i++) {
				//System.out.println("Thread1 : " + "StringBuilder : " + str);
				addChar(str);
				//stringBuilder.append("#");
			}

		});

		Thread thread2 = new Thread(() -> {
			// Append "#" at the end of stringBuilder
			for (int i = 0; i < 500; i++) {
				//System.out.println("Thread2 : " + "StringBuilder : " + str);
				addChar(str);
				//stringBuilder.append("#");
			}

		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}

		//System.out.println("Final Output : " + str);
		System.out.println("Final Output Length : " + str.length());

	}
}

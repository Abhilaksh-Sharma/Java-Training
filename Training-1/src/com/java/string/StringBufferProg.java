package com.java.string;

public class StringBufferProg {
	
	public static void addChar(StringBuffer strBuffer) {
        /*
         * Here appended 6 A and removed 5 A at each call to this method. Total
         * 1 A at each call Expected Accurate Total StringBuffer length = loops
         * in run method * 1 i.e. 500 * 1 for one thread Here we have 2
         * threads so = 1000
         */
        try {
            strBuffer.append("A");
            strBuffer.append("A");
            strBuffer.append("A");
            strBuffer.deleteCharAt(0);
            strBuffer.append("A");
            strBuffer.append("A");
            strBuffer.append("A");
            for (int i = 0; i < 4; i++) {
                strBuffer.deleteCharAt(0);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A wasn't at index 0 " + e.getMessage());
        }
    }
	
	
	public static void main(String[] args) {

		StringBuffer strBuffer = new StringBuffer();

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				addChar(strBuffer);
			}

		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				addChar(strBuffer);
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

		//System.out.println("Final Output : " + strBuffer);
		System.out.println("Final Output Length : " + strBuffer.length());

	}
}

package com.java.string;

public class StringBufferBuilderPerformanceDemo {
	 
    public void getStringBufferPerformance() {
 
        StringBuffer strBufferOne = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            strBufferOne.append(i);
            strBufferOne.append(" ");
            strBufferOne.append(i);
            strBufferOne.append(" ");
        }
 
        System.out.println("Time Taken by StringBuffer is: " + (System.currentTimeMillis() - startTime) + " ms");
 
    }
 
    public void getStringBuilderPerformance() {
 
        StringBuilder strBuilderOne = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            strBuilderOne.append(i);
            strBuilderOne.append(" ");
            strBuilderOne.append(i);
            strBuilderOne.append(" ");
        }
 
        System.out.println("Time Taken by StringBuilder is: " + (System.currentTimeMillis() - startTime) + " ms");
 
    }
    public static void main(String[] args) {
 
        StringBufferBuilderPerformanceDemo obj = new StringBufferBuilderPerformanceDemo();
        obj.getStringBufferPerformance();
        obj.getStringBuilderPerformance();
    }
 
}
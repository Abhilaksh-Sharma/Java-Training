package com.java.practice;

import java.util.Scanner;
import java.util.stream.Stream;

public class Practice1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int arr[] = {1,2,3};
		
		/* NAIVE APPROACH */
		System.out.println("\nNested Loops Approach :- \n");
		for(int subArrSize=1;subArrSize<=arr.length;subArrSize++) {//OuterMost LOOP --> SubArraySize
			for(int subArrIndex = 0; subArrIndex<arr.length ; subArrIndex++) { //Inner LOOP --> SubArray_STARTIndex
				//Index Overflow
				if(subArrIndex+subArrSize>arr.length) {
					break;
				}
				
				for(int i=subArrIndex;i<(subArrIndex+subArrSize);i++) { //InnerMost LOOP --> Looping all Sub Arrays of size defined in the root-parent loop with startIndex defined in the immediate parent loop
					System.out.print(arr[i] + " ");
				}
				
				System.out.println();
			}
		}
		
		
		//BIT-PATTERN Approach
		System.out.println("\nBit Pattern Approach :- \n");
		for(int i=1;i<Math.pow(2, arr.length);i++) {
			String binary = Integer.toBinaryString(i);

			System.out.println("Binary String : " + binary);
			for(int j=binary.length()-1,k=0;j>=0;j--,k++) {
				if(binary.charAt(j)=='1') {
					System.out.print(arr[k] + " ");
				}
			}
			
			System.out.println();
		}
		

		
	}

}

package com.java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        //Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            
        	String[] size = br.readLine().trim().split("\\s+");
        	
            int m = Integer.parseInt(size[0]);
            int n = Integer.parseInt(size[1]);
            
            int a[][] = new int[m][n];
            
            int i=0,j=0,k=0;
            //Calculate MAX ELement during INPUT
            int max = 0;
            for(i=0;i<m;i++){            	
            	String[] input = br.readLine().trim().split("\\s+");
                for(j=0;j<n;j++){
                    //a[i][j] = in.nextInt();
                	a[i][j] = Integer.parseInt(input[j]);
                    if(a[i][j]>max){
                        max=a[i][j];
                    }
                }
            }
            
            //Store the indices for MAX Element
            
            List<Integer> maxI = new ArrayList<Integer>();
            List<Integer> maxJ = new ArrayList<Integer>();
            
            for(i=0;i<m;i++) {
            	for(j=0;j<n;j++) {
            		if(a[i][j]==max) {
            			maxI.add(i);
            			maxJ.add(j);
            		}
            	}
            }
            

            
            //System.out.println("Max Value  : " + max);
            
            //Calculate Middle Elements INDICES
            
            int rowIndex[] , colIndex[];
            
            //List<Integer> rowIndex = new ArrayList<Integer>();
           // List<Integer> colIndex = new ArrayList<Integer>();
            
            //Case-1 : Both m & n are ODD ==> 1 Center
           if(m%2!=0 && n%2!=0){
        	   
        	   rowIndex = new int[1];
        	   colIndex = new int[1];
        	   
        	   rowIndex[0] = m/2;
        	   colIndex[0] = n/2;
        	   
//               rowIndex.add(m/2);
//               colIndex.add(n/2);
           }
           //Case-2 : Either m or n is ODD ==> 2 Centers
           else if((m%2==0 && n%2!=0) || (m%2!=0 && n%2==0)){
        	   
        	   rowIndex = new int[2];
        	   colIndex = new int[2];
        	   
               if(m%2==0 && n%2!=0){
                   //Index-0
            	   rowIndex[0] = (m/2)-1;
            	   colIndex[0] = n/2;
            	   
//                   rowIndex.add((m/2)-1);
//                   colIndex.add(n/2);
                   //Index-1
            	   
            	   rowIndex[1] = m/2;
            	   colIndex[1] = n/2;
            	   
//                   rowIndex.add(m/2);
//                   colIndex.add(n/2);
               }
               else{
                   //Index-0
            	   
            	   rowIndex[0] = m/2;
            	   colIndex[0] = (n/2)-1;
//                   rowIndex.add(m/2);
//                   colIndex.add((n/2)-1);
                   //Index-1
            	   
            	   rowIndex[1] = m/2;
            	   colIndex[1] = n/2;
            	   
//                   rowIndex.add(m/2);
//                   colIndex.add(n/2);
               }
               
           }
           //Case-3 : Both m & n are EVEN ==> 4 Centers
           else{
               
        	   rowIndex = new int[4];
        	   colIndex = new int[4];
        	   
                //Index-0
        	   rowIndex[0] = (m/2)-1;
        	   colIndex[0] = (n/2)-1;
        	   
//                rowIndex.add((m/2)-1);
//                colIndex.add((n/2)-1);
                
                //Index-1
                rowIndex[1] = (m/2)-1;
           	   colIndex[1] = n/2;
                
//                rowIndex.add((m/2)-1);
//                colIndex.add(n/2);
                
                //Index-2
                rowIndex[2] = m/2;
          	   colIndex[2] = (n/2)-1;
                
//                rowIndex.add(m/2);
//                colIndex.add((n/2)-1);
                
                //Index-3
                rowIndex[3] = m/2;
         	   colIndex[3] = n/2;
                
//                rowIndex.add(m/2);
//                colIndex.add(n/2);
               
           }
           
           //Special Cases : Zero Swaps required 
           if(m==1&&n==1 || m==2&&n==2){
               System.out.println(0);
               t--;
               continue;
           }
           
//           for(i=0;i<rowIndex.size();i++) {
//        	   System.out.println("Row : " + rowIndex.get(i) + " Column : " + colIndex.get(i));
//           }
           
           //Matrix Traversal for Minimum Swap
           int swap = Integer.MAX_VALUE;
           
          // for(i=0;i<m;i++){
           for(i=0;i<maxI.size();i++) {
               //for(j=0;j<n;j++){
                   //MAX Element HIT
                   if(a[maxI.get(i)][maxJ.get(i)]==max){
                       
                       //Traverse through Mid Element INDICES
                       //for(k=0;k<rowIndex.size();k++){
                	   for(k=0;k<rowIndex.length;k++){
                           //int diff = Math.abs(i-rowIndex.get(k)) + Math.abs(j-colIndex.get(k));
                		   int diff = Math.abs(i-rowIndex[k]) + Math.abs(j-colIndex[k]);
                		   
                		   //System.out.println("Diff : " + diff);
                           if(diff < swap){
                               swap = diff;
                           }
                           
                       }
                       
                       
                   }
              // }
           }
           
           System.out.println(swap);
           
           t--;
            
        }

    }
}

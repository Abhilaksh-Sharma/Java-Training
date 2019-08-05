package com.java.collections;

import java.util.Stack;

public class StackProg {
	
	// Pushing element on the top of the stack 
    static void stack_push(Stack<Integer> stack) 
    { 
        for(int i = 0; i < 5; i++) 
        { 
            stack.push(i); 
        } 
    } 
      
    // Popping element from the top of the stack 
    static void stack_pop(Stack<Integer> stack) 
    { 
        System.out.print("Pop :"); 
  
        for(int i = 0; i < 5; i++) 
        { 
            System.out.print(stack.pop() + " "); 
        } 
        
        System.out.println();
    } 
  
    // Displaying element on the top of the stack 
    static void stack_peek(Stack<Integer> stack) 
    { 
        Integer element = (Integer) stack.peek(); 
        System.out.println("\nElement on stack top : " + element); 
    } 
      
    // Searching element in the stack 
    static void stack_search(Stack<Integer> stack, int element) 
    { 
        Integer pos = (Integer) stack.search(element); 
  
        if(pos == -1) 
            System.out.println("\nElement not found"); 
        else
            System.out.println("\nElement is found at position " + pos); 
    } 
  
  
    public static void main (String[] args) 
    { 
        Stack<Integer> stack = new Stack<Integer>(); 
  
        stack_push(stack); 
        stack_pop(stack); 
        stack_push(stack); 
        stack_peek(stack); 
        stack_search(stack, 2); 
        stack_search(stack, 6); 
    } 

}

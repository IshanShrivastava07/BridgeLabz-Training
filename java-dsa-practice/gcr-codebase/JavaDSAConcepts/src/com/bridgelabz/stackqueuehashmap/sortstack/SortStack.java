package com.bridlelabz.stackqueuehashmap.sortstack;

import java.util.*;
public class SortStack {

	public static void sortStack(Stack<Integer>stack) {
		if(stack.isEmpty()) return;
		
		int top = stack.pop();
		sortStack(stack);
		insertSorted(stack,top);
	}
	
	private static void insertSorted(Stack<Integer>stack, int value) {
		if(stack.isEmpty() || stack.peek() <= value) {
			stack.push(value);
			return;
		}
		int top = stack.pop();
		insertSorted(stack, value);
		stack.push(top);
;  	}
}

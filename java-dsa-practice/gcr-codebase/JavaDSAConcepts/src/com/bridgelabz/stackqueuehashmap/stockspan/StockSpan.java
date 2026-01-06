package com.bridgelabz.stackqueuehashmap.stockspan;

import java.util.*;
public class StockSpan {
 
	public static int[] calculateSpan(int[] arr) {
		int n = arr.length;
		int[] span = new int[n];
		Stack<Integer> stack = new Stack<>();
		
	
		for(int i = 0; i < n; i++) {
			while(!stack.isEmpty() && arr[stack.peek()] <= arr[i] ) {
				stack.pop();
			}
			span[i] = stack.isEmpty()? i + 1 : i - stack.peek();
			stack.push(i);
			}
		return span;
	}
}

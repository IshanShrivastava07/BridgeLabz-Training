package com.bridgelabz.stackqueuehashmap.stockspan;
 
public class StockSpanMain {

	public static void main(String[] args) {
		
		int[] arr = {2,6,4,8,3,2,1,7,1};
		
		int[] span = StockSpan.calculateSpan(arr);
		
		for(int i : span) {
			System.out.println(i+ " ");
		}
 				
	}
}

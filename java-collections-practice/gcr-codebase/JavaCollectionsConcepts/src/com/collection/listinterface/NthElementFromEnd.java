package com.collection.listInterface;

import java.util.*;


public class NthElementFromEnd {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
	int n = 2;
	String res = nthFromEnd(list,n);
	System.out.println(list);
}
	
public static String nthFromEnd(LinkedList<String> list, int n) {
	Iterator<String> fast = list.iterator();
	Iterator<String> slow = list.iterator();
	
	for(int i = 0; i < n; i++) {
		
		if(!fast.hasNext()) return null;
		fast.next();
	}
	
	while(fast.hasNext()) {
		fast.next();
		slow.next();
	}
	;
	return slow.next();
}
	
}
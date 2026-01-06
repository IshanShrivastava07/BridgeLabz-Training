package com.bridgelabz.stackqueuehashmap.queueusingstack;

import java.util.*;
public class QueueUsingStacks {
private Stack<Integer> in = new Stack<>();
private Stack<Integer> out = new Stack<>();

public void enqueue(int n) {
	in.push(n);
}

public int dequeue() {
	if(out.isEmpty()) {
		while(!in.isEmpty()) {
			out.push(in.pop());
		}
	}
	if(out.isEmpty()) {
		throw new RuntimeException("Queue is empty");
	}
	return out.pop();
}
public int peek() {
	if(out.isEmpty()) {
		while(!in.isEmpty()) {
			out.push(in.pop());
		}
	}
	if(out.isEmpty()) {
		throw new RuntimeException("Queue is Empty");
	}
	return out.peek();
}
public boolean isEmpty() {
	return in.isEmpty() && out.isEmpty();
	
}
}

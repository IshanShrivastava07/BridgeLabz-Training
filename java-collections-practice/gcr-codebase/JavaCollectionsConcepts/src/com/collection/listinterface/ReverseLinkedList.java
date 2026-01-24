package com.collection.listInterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;



public class ReverseLinkedList {
public static void main(String[] args) {
	
LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));

ListIterator<Integer> left = list.listIterator();
ListIterator<Integer> right = list.listIterator(list.size());

int i = 0;
int j = list.size() - 1;

while(i < j) {
	int a = left.next();
	int b = right.previous();
	
	left.set(b);
	right.set(a);
	
	i++;
	j--;
	
}
System.out.println(list);

}
}

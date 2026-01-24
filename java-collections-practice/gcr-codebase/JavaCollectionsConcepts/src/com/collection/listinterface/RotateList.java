package com.collection.listInterface;
import java.util.*;
 
public class RotateList {
	public static void main(String[] args) {
		
	
List<Integer> list = Arrays.asList(10,20,30,40,50,90,100);
  int k = 3;
  
  int n = list.size();
  
  k = k % n;
  
  List<Integer> result = new ArrayList<Integer>();
  
  for(int i = k; i < n; i++) {
	  result.add(i);
  }
  
  for(int i = 0; i < k; i++) {
	  result.add(i);
  }
  System.out.println(list);
	}
}

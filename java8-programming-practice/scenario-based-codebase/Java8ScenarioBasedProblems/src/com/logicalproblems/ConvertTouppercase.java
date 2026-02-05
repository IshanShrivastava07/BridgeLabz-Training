package com.logicalproblems;

import java.util.List;

public class ConvertTouppercase {
public static void main(String[] args) {
	List<String> list = List.of("java","spring","boot");
	
	List<String> srList =   list .stream()
	.map(String::toUpperCase)
	.toList();
	
	System.out.println(srList);
}
}

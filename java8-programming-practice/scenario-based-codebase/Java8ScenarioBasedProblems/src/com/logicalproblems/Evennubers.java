package com.logicalproblems;

import java.util.List;

public class Evennubers {
public static void main(String[] args) {
	List <Integer> list = List.of(2,5,7,8,10,13);
	list.stream()
	.filter(x -> x % 2 == 0)
	.forEach(System.out::println);

}
}

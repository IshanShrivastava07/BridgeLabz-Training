package com.logicalproblems;

public class CountVowels {
	public static void main(String[] args) {
		String str = "programming";
	long count = str.chars()
		.filter(s -> isVowel((char) s))
		.count();
		
	System.out.println(count);
	}
public static boolean isVowel(char s) {
	if("aeiouAEIOU".indexOf(s) >= 0) {
		return true;
	}
	return false;
}

}

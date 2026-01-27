package com.regex.modifyNreplace.spacemodifier;

public class SpaceModifier {

	    public static void main(String[] args) {
	        String text = "Java   is    a    powerful     language";

	        // Replace one or more spaces with a single space
	        String result = text.replaceAll("\\s+", " ");

	        System.out.println(result);
	    }
	}




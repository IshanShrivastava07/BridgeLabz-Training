package com.regex.modifyNreplace.badwordscensor;

public class BadWordCensor {

    public static void main(String[] args) {
        String text = "This code is ugly and some parts are stupid and dumb";

        // List of bad words
        String badWords = "ugly|stupid|dumb";

        // Replace each bad word with ****
        String censoredText = text.replaceAll("(?i)\\b(" + badWords + ")\\b", "****");

        System.out.println(censoredText);
    }
}

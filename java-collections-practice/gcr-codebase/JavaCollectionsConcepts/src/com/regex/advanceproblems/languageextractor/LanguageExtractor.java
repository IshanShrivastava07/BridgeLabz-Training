package com.regex.advanceproblems.languageextractor;

import java.util.regex.*;

public class LanguageExtractor {

    public static void main(String[] args) {
        String text = "I enjoy C++, Java, Kotlin and Rust but not PHP.";

        Pattern p = Pattern.compile("\\b(Java|Python|JavaScript|Go|C\\+\\+|Kotlin|Rust|PHP)\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

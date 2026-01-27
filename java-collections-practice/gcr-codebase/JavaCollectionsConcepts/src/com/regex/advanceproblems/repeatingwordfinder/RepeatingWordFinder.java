package com.regex.advanceproblems.repeatingwordfinder;

import java.util.regex.*;

public class RepeatingWordFinder {

    public static void main(String[] args) {
        String text = "Hello hello world world test test done";

        Pattern p = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}


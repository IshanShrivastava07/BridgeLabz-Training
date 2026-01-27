package com.regex.advanceproblems.currencyextractor;

import java.util.regex.*;

public class CurrencyExtractor {

    public static void main(String[] args) {
        String text = "Total amount is 250.75 and tax is $19.99";

        Pattern p = Pattern.compile("\\$?\\b\\d+\\.\\d{2}\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}


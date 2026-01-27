package com.regex.extraction.emailExtraction;

import java.util.regex.*;

public class Email {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";

        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

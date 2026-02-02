package com.functionalinterface.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtil {
    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class Date {
    public static void main(String[] args) {
        System.out.println(DateUtil.format(LocalDate.now(), "dd-MM-yyyy"));
    }
}


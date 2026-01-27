package com.annotations.repeatableannotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Tester {

    @BugReport(description = "Null pointer bug")
    @BugReport(description = "Performance issue")
    void test() {
        System.out.println("Testing");
    }
}

public class RepeatableAnnotations {
    public static void main(String[] args) throws Exception {
        Method m = Tester.class.getMethod("test");
        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);

        for (BugReport b : bugs) {
            System.out.println(b.description());
        }
    }
}

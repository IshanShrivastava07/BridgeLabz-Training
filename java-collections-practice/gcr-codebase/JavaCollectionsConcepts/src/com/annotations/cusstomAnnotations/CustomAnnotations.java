package com.annotations.cusstomAnnotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    int priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Ishan")
    void doTask() {
        System.out.println("Task done");
    }
}

public class CustomAnnotations {
    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getMethod("doTask");
        TaskInfo info = m.getAnnotation(TaskInfo.class);

        System.out.println(info.priority());
        System.out.println(info.assignedTo());
    }
}


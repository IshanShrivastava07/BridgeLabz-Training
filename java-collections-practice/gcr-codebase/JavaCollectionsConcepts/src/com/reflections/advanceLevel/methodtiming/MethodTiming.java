package com.reflections.advanceLevel.methodtiming;

import java.lang.reflect.*;

public class MethodTiming {

    static class Worker {
        public void doWork() throws InterruptedException {
            Thread.sleep(500);
            System.out.println("Work completed");
        }
    }

    public static void main(String[] args) throws Exception {

        Worker worker = new Worker();

        Method method = Worker.class.getMethod("doWork");

        long start = System.currentTimeMillis();

        method.invoke(worker);

        long end = System.currentTimeMillis();

        System.out.println("Execution Time: " + (end - start) + " ms");
    }
}

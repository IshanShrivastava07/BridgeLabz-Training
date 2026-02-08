package com.multithreading.threadsafemonitoring;

class TaskRunner extends Thread {
    TaskRunner(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(2000); // TIMED_WAITING
            for (int i = 0; i < 1_000_000; i++); // RUNNABLE
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

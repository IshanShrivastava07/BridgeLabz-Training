package com.multithreading.threadsafemonitoring;

class StateMonitor extends Thread {
    private Thread[] tasks;

    StateMonitor(Thread[] tasks) {
        this.tasks = tasks;
    }

    public void run() {
        boolean running = true;
        while (running) {
            running = false;
            for (Thread t : tasks) {
                System.out.println("[Monitor] " + t.getName() +
                        " is in " + t.getState() +
                        " at " + java.time.LocalTime.now());
                if (t.getState() != Thread.State.TERMINATED) {
                    running = true;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Summary: All tasks completed");
    }
}

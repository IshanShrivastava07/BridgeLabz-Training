package com.multithreading.restaurentorderprocessing;

class Chef extends Thread {
    private String dish;
    private int time;

    Chef(String name, String dish, int time) {
        super(name);
        this.dish = dish;
        this.time = time;
    }
    
    public void run() {
        try {
            System.out.println(getName() + " started preparing " + dish);
            for (int i = 25; i <= 100; i += 25) {
                Thread.sleep(time / 4);
                System.out.println(getName() + " preparing " + dish + ": " + i + "% complete");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

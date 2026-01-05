package com.bridgelabz.smarthomesystem;

public abstract class Appliance implements Controllable {
    private boolean status;

    protected void setStatus(boolean status) {
        this.status = status;
    }
}

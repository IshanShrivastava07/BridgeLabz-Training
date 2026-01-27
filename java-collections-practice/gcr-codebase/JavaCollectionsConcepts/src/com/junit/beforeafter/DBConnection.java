package com.junit.beforeafter;


public class DBConnection {

    private boolean connected = false;

    public void connect() { connected = true; }

    public void disconnect() { connected = false; }

    public boolean isConnected() { return connected; }
}

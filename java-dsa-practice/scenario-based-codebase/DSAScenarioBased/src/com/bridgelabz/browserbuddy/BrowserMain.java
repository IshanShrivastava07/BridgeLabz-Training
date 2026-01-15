package com.bridgelabz.browserbuddy;

public class BrowserMain {
    public static void main(String[] args) {

        BrowserTab tab = new BrowserTab();

        tab.visit("google.com");
        tab.visit("youtube.com");
        tab.visit("github.com");

        tab.back();
        tab.showCurrentPage();

        tab.forward();
        tab.showCurrentPage();

        tab.closeTab();
        tab.reopenTab();
        tab.showCurrentPage();
    }
}

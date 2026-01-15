package com.bridgelabz.texteditor;

public class Action {

	// insert or delete
    String type;   
    String text;

    Action next;

    public Action(String type, String text) {
        this.type = type;
        this.text = text;
        this.next = null;
    }
}

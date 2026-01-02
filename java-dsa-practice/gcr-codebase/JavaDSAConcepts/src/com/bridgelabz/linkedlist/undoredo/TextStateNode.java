package com.bridgelabz.linkedlist.undoredo;

public class TextStateNode {

    String content;
    TextStateNode prev;
    TextStateNode next;

    public TextStateNode(String content) {
        this.content = content;
    }
}

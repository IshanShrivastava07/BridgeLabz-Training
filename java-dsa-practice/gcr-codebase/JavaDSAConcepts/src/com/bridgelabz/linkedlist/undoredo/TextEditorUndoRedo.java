package com.bridgelabz.linkedlist.undoredo;

public class TextEditorUndoRedo {

    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;

    private final int MAX_HISTORY = 10;
    private int size = 0;

    // Add new text state
    public void addState(String content) {
        TextStateNode node = new TextStateNode(content);

        // Clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = node;
            size = 1;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        current = node;
        size++;

        // Limit history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current text
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("No content");
        }
    }
}

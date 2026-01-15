package com.bridgelabz.texteditor;

public class Stack {

    private Action top;

    // Push action
    public void push(Action action) {
        action.next = top;
        top = action;
    }

    // Pop action
    public Action pop() {
        if (top == null)
            return null;

        Action temp = top;
        top = top.next;
        return temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void clear() {
        top = null;
    }
}

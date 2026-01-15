package com.bridgelabz.examproctor;

public class QuestionStack {
    private int[] stack;
    private int top;

    public QuestionStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int qId) {
        stack[++top] = qId;
    }

    public int peek() {
        return top == -1 ? -1 : stack[top];
    }
}

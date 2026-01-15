package com.bridgelabz.callcenter;

public class NormalQueue {
    private Customer front, rear;

    public void enqueue(Customer c) {
        if (rear == null) {
            front = rear = c;
            return;
        }
        rear.next = c;
        rear = c;
    }

    public Customer dequeue() {
        if (front == null) return null;

        Customer temp = front;
        front = front.next;

        if (front == null)
            rear = null;

        return temp;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

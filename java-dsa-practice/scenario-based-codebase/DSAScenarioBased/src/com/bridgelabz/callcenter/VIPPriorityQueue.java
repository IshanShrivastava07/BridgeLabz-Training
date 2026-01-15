package com.bridgelabz.callcenter;

public class VIPPriorityQueue {
    private Customer head;

    public void enqueue(Customer c) {

        if (head == null || c.priority > head.priority) {
            c.next = head;
            head = c;
            return;
        }

        Customer current = head;
        while (current.next != null &&
               current.next.priority >= c.priority) {
            current = current.next;
        }

        c.next = current.next;
        current.next = c;
    }

    public Customer dequeue() {
        if (head == null) return null;

        Customer temp = head;
        head = head.next;
        return temp;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

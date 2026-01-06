package com.bridgelabz.stackqueuehashmap.queueusingstack;

public class QueueMain{
	
public static void main(String[] args) {
    QueueUsingStacks queue = new QueueUsingStacks();

    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    System.out.println(queue.dequeue()); // 10
    System.out.println(queue.peek());    // 20
    System.out.println(queue.dequeue()); // 20
    System.out.println(queue.dequeue()); // 30
}
}
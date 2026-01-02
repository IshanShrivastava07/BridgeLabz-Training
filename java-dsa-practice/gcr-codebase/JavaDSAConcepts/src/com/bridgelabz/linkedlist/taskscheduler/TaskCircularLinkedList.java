package com.bridgelabz.linkedlist.taskscheduler;

public class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode current; // for scheduler rotation

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        node.next = head;
        temp.next = node;
        head = node;
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = head;
    }

    // Add at position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode node = new TaskNode(id, name, priority, dueDate);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove by Task ID
    public void removeByTaskId(int id) {
        if (head == null) return;

        TaskNode curr = head;
        TaskNode prev = null;

        do {
            if (curr.taskId == id) {
                if (curr == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                    current = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // View current task and move to next
    public void viewNextTask() {
        if (current == null) return;

        System.out.println("Current Task: " +
                current.taskId + " | " + current.taskName +
                " | Priority: " + current.priority +
                " | Due: " + current.dueDate);

        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " | " + temp.taskName +
                    " | Priority: " + temp.priority +
                    " | Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskId + " | " + temp.taskName +
                        " | Due: " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }
}

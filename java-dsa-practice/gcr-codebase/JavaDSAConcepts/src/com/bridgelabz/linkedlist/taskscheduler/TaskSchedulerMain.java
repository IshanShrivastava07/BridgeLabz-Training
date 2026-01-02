package com.bridgelabz.linkedlist.taskscheduler;

public class TaskSchedulerMain {

    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtBeginning(1, "Design Module", 1, "10-02-2026");
        scheduler.addAtEnd(2, "Write Code", 2, "12-02-2026");
        scheduler.addAtEnd(3, "Testing", 3, "15-02-2026");

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nTask Rotation:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("\nSearch by Priority 2:");
        scheduler.searchByPriority(2);

        scheduler.removeByTaskId(1);

        System.out.println("\nAfter Deletion:");
        scheduler.displayAllTasks();
    }
}

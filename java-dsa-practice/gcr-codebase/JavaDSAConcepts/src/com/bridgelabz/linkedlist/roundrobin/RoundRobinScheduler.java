package com.bridgelabz.linkedlist.roundrobin;

public class RoundRobinScheduler {

    private ProcessNode head;
    private int processCount = 0;

    // Add process at end
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode node = new ProcessNode(pid, burstTime, priority);
        processCount++;

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
    }

    // Simulate Round Robin Scheduling
    public void simulate(int timeQuantum) {
        if (head == null) return;

        int currentTime = 0;
        ProcessNode curr = head;

        while (processCount > 0) {

            if (curr.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= execTime;
                currentTime += execTime;

                updateWaitingTime(curr, execTime);

                if (curr.remainingTime == 0) {
                    curr.turnaroundTime = currentTime;
                    removeProcess(curr.processId);
                }
            }

            displayQueue();
            curr = curr.next;
        }

        displayAverageTimes();
    }

    // Update waiting time for other processes
    private void updateWaitingTime(ProcessNode running, int execTime) {
        ProcessNode temp = head;
        if (temp == null) return;

        do {
            if (temp != running && temp.remainingTime > 0) {
                temp.waitingTime += execTime;
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Remove process by PID
    private void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = null;

        do {
            if (curr.processId == pid) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        ProcessNode last = head;
                        while (last.next != head) last = last.next;
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                processCount--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display queue after each round
    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue Empty");
            return;
        }

        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("[P" + temp.processId +
                    " RT:" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Average waiting & turnaround time
    private void displayAverageTimes() {
        double totalWT = 0, totalTAT = 0;
        ProcessNode temp = head;

        if (temp == null) {
            System.out.println("\nAll processes completed.");
            return;
        }

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            temp = temp.next;
        } while (temp != head);

        System.out.println("\nAverage Waiting Time: " + (totalWT / processCount));
        System.out.println("Average Turnaround Time: " + (totalTAT / processCount));
    }
}

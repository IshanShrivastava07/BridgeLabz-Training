package com.bridgelabz.ambulanceroute;

public class AmbulanceRoute {

    private Hospital head;
    private Hospital tail;

    // add unit to circular list
    public void addUnit(String name, boolean available) {
        Hospital newUnit = new Hospital(name, available);

        if (head == null) {
            head = newUnit;
            tail = newUnit;
            tail.next = head;
        } else {
            tail.next = newUnit;
            tail = newUnit;
            tail.next = head;
        }
    }

    // find nearest available unit
    public void routePatient() {
        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        Hospital temp = head;
        do {
            if (temp.available) {
                System.out.println("Patient routed to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("All units are currently unavailable");
    }

    // remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        Hospital curr = head;
        Hospital prev = tail;

        do {
            if (curr.name.equals(unitName)) {

                // only one node
                if (curr == head && curr == tail) {
                    head = null;
                    tail = null;
                }
                // removing head
                else if (curr == head) {
                    head = head.next;
                    tail.next = head;
                }
                // removing tail
                else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                }
                // middle node
                else {
                    prev.next = curr.next;
                }

                System.out.println(unitName + " removed for maintenance");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    public void displayUnits() {
        if (head == null) return;

        Hospital temp = head;
        do {
            System.out.println(temp.name + " | Available: " + temp.available);
            temp = temp.next;
        } while (temp != head);
    }
}

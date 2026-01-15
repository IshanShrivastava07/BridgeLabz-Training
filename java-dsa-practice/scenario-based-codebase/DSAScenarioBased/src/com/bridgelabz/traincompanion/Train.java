package com.bridgelabz.traincompanion;

public class Train {

    private Compartment head;
    private Compartment tail;

    // Insert compartment at end
    public void addCompartment(String name) {

        Compartment newNode = new Compartment(name);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove compartment by name
    public void removeCompartment(String name) {

        Compartment current = head;

        while (current != null) {

            if (current.name.equals(name)) {

                if (current == head)
                    head = current.next;

                if (current == tail)
                    tail = current.prev;

                if (current.prev != null)
                    current.prev.next = current.next;

                if (current.next != null)
                    current.next.prev = current.prev;

                return;
            }
            current = current.next;
        }
    }

    // Traverse forward
    public void moveForward() {

        Compartment temp = head;

        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    public void moveBackward() {

        Compartment temp = tail;

        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {

        Compartment temp = head;

        while (temp != null) {

            if (temp.name.equals(name)) {

                System.out.println("Current : " + temp.name);

                System.out.println(
                        "Previous: " +
                        (temp.prev != null ? temp.prev.name : "None")
                );

                System.out.println(
                        "Next    : " +
                        (temp.next != null ? temp.next.name : "None")
                );
                return;
            }
            temp = temp.next;
        }
    }
}

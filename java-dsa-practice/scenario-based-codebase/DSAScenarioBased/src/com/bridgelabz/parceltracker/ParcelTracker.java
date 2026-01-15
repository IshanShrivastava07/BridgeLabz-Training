package com.bridgelabz.parceltracker;

public class ParcelTracker {

    private StageNode head;

    // add stage at end
    public void addStage(String stage) {
        StageNode newNode = new StageNode(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // add custom checkpoint after a stage
    public void addCheckpointAfter(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stage.equals(afterStage)) {
                StageNode node = new StageNode(newStage);
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
        }
    }

    // forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost / no tracking info");
            return;
        }

        StageNode temp = head;
        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

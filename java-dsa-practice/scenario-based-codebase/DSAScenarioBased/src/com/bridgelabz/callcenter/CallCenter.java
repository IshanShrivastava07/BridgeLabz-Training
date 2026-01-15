package com.bridgelabz.callcenter;

public class CallCenter {

    private NormalQueue normalQueue = new NormalQueue();
    private VIPPriorityQueue vipQueue = new VIPPriorityQueue();
    private CallCountHashTable callTable = new CallCountHashTable();

    public void receiveCall(Customer c) {

        callTable.incrementCall(c.id);

        if (c.isVIP) {
            vipQueue.enqueue(c);
        } else {
            normalQueue.enqueue(c);
        }
    }

    public Customer attendCall() {

        if (!vipQueue.isEmpty())
            return vipQueue.dequeue();

        if (!normalQueue.isEmpty())
            return normalQueue.dequeue();

        return null;
    }

    public int getCallCount(int id) {
        return callTable.getCallCount(id);
    }
}


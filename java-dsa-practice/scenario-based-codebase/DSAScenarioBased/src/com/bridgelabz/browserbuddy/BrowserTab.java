package com.bridgelabz.browserbuddy;

import java.util.Stack;

public class BrowserTab {

    private HistoryNode current;
    private Stack<String> closedTabs = new Stack<>();

    // open new page
    public void visit(String url) {
        HistoryNode node = new HistoryNode(url);

        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    // go back
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    // go forward
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    // close tab
    public void closeTab() {
        if (current != null) {
            closedTabs.push(current.url);
            current = null;
        }
    }

    // reopen last closed tab
    public void reopenTab() {
        if (!closedTabs.isEmpty()) {
            visit(closedTabs.pop());
        }
    }

    public void showCurrentPage() {
        if (current != null)
            System.out.println("Current Page: " + current.url);
        else
            System.out.println("No page open");
    }
}

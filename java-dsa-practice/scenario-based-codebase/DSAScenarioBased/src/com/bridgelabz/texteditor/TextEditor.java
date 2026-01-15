package com.bridgelabz.texteditor;

public class TextEditor {

    private String content = "";

    private Stack undoStack = new Stack();
    private Stack redoStack = new Stack();

    // Insert text
    public void insert(String text) {
        content = content + text;
        undoStack.push(new Action("insert", text));
        redoStack.clear(); // redo invalid after new action
    }

    // Delete text
    public void delete(String text) {
        content = content.replace(text, "");
        undoStack.push(new Action("delete", text));
        redoStack.clear();
    }

    // Undo operation
    public void undo() {

        if (undoStack.isEmpty())
            return;

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content = content.replace(action.text, "");
        } else if (action.type.equals("delete")) {
            content = content + action.text;
        }

        redoStack.push(action);
    }

    // Redo operation
    public void redo() {

        if (redoStack.isEmpty())
            return;

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content = content + action.text;
        } else if (action.type.equals("delete")) {
            content = content.replace(action.text, "");
        }

        undoStack.push(action);
    }

    public void showContent() {
        System.out.println("Content: " + content);
    }
}


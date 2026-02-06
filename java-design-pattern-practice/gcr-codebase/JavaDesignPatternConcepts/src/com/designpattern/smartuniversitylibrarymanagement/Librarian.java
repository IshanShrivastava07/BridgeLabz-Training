package com.designpattern.smartuniversitylibrarymanagement;

class Librarian extends User {

    public Librarian(String name) {
        super(name);
    }

    @Override
    public void update(String bookName) {
        System.out.println("Librarian " + name +
                " notified about catalog update: " + bookName);
    }
}

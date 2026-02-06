package com.designpattern.smartuniversitylibrarymanagement;

class Faculty extends User {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public void update(String bookName) {
        System.out.println("Faculty " + name +
                " notified: Book available -> " + bookName);
    }
}


package com.designpattern.smartuniversitylibrarymanagement;

class Student extends User {

    public Student(String name) {
        super(name);
    }

    @Override
    public void update(String bookName) {
        System.out.println("Student " + name +
                " notified: Book available -> " + bookName);
    }
}

package com.designpattern.smartuniversitylibrarymanagement;

class UserFactory {

    public static User createUser(String role, String name) {

        if (role.equalsIgnoreCase("student"))
            return new Student(name);

        if (role.equalsIgnoreCase("faculty"))
            return new Faculty(name);

        if (role.equalsIgnoreCase("librarian"))
            return new Librarian(name);

        throw new IllegalArgumentException("Invalid role");
    }
}

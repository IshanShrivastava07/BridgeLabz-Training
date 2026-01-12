package com.bridgelabz.skillforge;

public class Course {
    private String title;
    private String instructor;
    private int rating; // protected logic
    private String[] modules;

    // Default Constructor
    public Course(String title, String instructor) {
        this(title, instructor, new String[]{"Intro", "Basics", "Advanced"});
    }
    
    // User-Defined Constructor
    public Course(String title, String instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    protected void updateRating(int newRating) {
        if (newRating >= 1 && newRating <= 5) {
            rating = newRating;
        }
    }

    public String getTitle() {
        return title;
    }
}

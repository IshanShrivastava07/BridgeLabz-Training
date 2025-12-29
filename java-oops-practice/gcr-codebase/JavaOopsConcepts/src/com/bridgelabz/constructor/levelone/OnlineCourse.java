package com.bridgelabz.constructor.levelone;

class OnlineCourse {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "ABC Institute";

    OnlineCourse(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " weeks | ₹" + fee + " | " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        OnlineCourse c1 = new OnlineCourse("Java", 8, 5000);
        OnlineCourse c2 = new OnlineCourse("Python", 6, 4500);

        c1.displayCourseDetails();
        OnlineCourse.updateInstituteName("BridgeLabz");
        c2.displayCourseDetails();
    }
}

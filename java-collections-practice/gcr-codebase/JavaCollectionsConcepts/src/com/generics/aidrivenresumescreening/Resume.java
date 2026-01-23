package com.generics.aidrivenresumescreening;

class Resume<T extends JobRole> {

    private T jobRole;

    Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    // Generic Method
    public <E> void printExtraInfo(E info) {
        System.out.println("Extra Info: " + info);
    }

    public void processResume() {
        System.out.println("Processing resume for: "
                + jobRole.candidateName
                + " | Role: "
                + jobRole.getRoleName());
    }
}

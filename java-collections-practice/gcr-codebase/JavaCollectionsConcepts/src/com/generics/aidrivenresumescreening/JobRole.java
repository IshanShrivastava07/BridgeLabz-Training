package com.generics.aidrivenresumescreening;

abstract class JobRole {
    String candidateName;

    JobRole(String name) {
        this.candidateName = name;
    }

    abstract String getRoleName();
}

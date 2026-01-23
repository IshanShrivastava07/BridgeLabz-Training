package com.generics.aidrivenresumescreening;

import java.util.*;

public class AIResumeMain {
    public static void main(String[] args) {

        SoftwareEngineer se = new SoftwareEngineer("Amit");
        DataScientist ds = new DataScientist("Neha");
        ProductManager pm = new ProductManager("Rohit");

        Resume<SoftwareEngineer> resume1 = new Resume<>(se);
        Resume<DataScientist> resume2 = new Resume<>(ds);

        resume1.processResume();
        resume2.processResume();

        resume1.printExtraInfo("5 years Java experience");

        List<JobRole> candidates = new ArrayList<>();
        candidates.add(se);
        candidates.add(ds);
        candidates.add(pm);

        ResumeScreeningSystem.screenAll(candidates);
    }
}

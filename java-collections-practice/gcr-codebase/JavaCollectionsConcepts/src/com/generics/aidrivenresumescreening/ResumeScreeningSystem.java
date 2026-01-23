package com.generics.aidrivenresumescreening;

import java.util.List;

class ResumeScreeningSystem {

    // Wildcard method: can accept any subtype of JobRole
    public static void screenAll(List<? extends JobRole> candidates) {
        for (JobRole role : candidates) {
            System.out.println("Screening candidate: "
                    + role.candidateName
                    + " for role: "
                    + role.getRoleName());
        }
    }
}

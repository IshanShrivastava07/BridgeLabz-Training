package com.bridgelabz.loanbuddy;

public interface IApprovable {
boolean approveLoan(Applicant applicant);
double calculateEMI(double principle, int months);
}

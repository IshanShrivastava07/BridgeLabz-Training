package com.bridgelabz.objectmodelling.levelone;

public class HospitalMain {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Dr. Mehta");
        Patient p1 = new Patient("Ishan");

        d1.consult(p1);
    }
}

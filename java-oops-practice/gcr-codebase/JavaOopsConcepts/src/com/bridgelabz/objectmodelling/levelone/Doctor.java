package com.bridgelabz.objectmodelling.levelone;

//Doctor communicates with Patient
public class Doctor {
 String name;

 public Doctor(String name) {
     this.name = name;
 }

 public void consult(Patient patient) {
     System.out.println(name + " consulted " + patient.name);
 }
}


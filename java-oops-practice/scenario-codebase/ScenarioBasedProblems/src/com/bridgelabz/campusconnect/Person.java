package com.bridgelabz.campusconnect;

public abstract class Person {
protected String name;
protected String email;
protected int id;

public Person( int id, String name, String email) {
	this.name = name;
	this.email= email;
	this.id = id;
}
public abstract void printDetails();

}

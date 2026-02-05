package com.studentstreams;

import java.util.List;

 class Student {

	
	int id;
	String firstnameString;
	int age;
	String genderString;
	String cityString;
	String departmentString;
	int rank;
	List<String> contacts;
	
	public Student(int id, String firstnameString, int age, String genderString, String cityString,
			String departmentString, int rank, List<String> contacts) {
		super();
		this.id = id;
		this.firstnameString = firstnameString;
		this.age = age;
		this.genderString = genderString;
		this.cityString = cityString;
		this.departmentString = departmentString;
		this.rank = rank;
		this.contacts = contacts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstnameString() {
		return firstnameString;
	}

	public void setFirstnameString(String firstnameString) {
		this.firstnameString = firstnameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenderString() {
		return genderString;
	}

	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
		this.cityString = cityString;
	}

	public String getDepartmentString() {
		return departmentString;
	}

	public void setDepartmentString(String departmentString) {
		this.departmentString = departmentString;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstnameString=" + firstnameString + ", age=" + age + ", genderString="
				+ genderString + ", cityString=" + cityString + ", departmentString=" + departmentString + ", rank="
				+ rank + ", contacts=" + contacts + "]";
	}

	
	
 }
	
	
 

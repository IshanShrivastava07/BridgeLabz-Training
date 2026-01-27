package com.iostreams.serialization;


import java.io.*;
import java.util.*;


public class Serialization {

	    public static void main(String[] args) {

	        List<Employee> list = new ArrayList<>();
	        list.add(new Employee(1, "Amit", "IT", 50000));
	        list.add(new Employee(2, "Neha", "HR", 45000));

	        // Serialize
	        try (ObjectOutputStream oos =
	                     new ObjectOutputStream(new FileOutputStream("emp.dat"))) {

	            oos.writeObject(list);
	            System.out.println("Employees saved.");

	        } catch (IOException e) {
	            System.out.println("Save error: " + e.getMessage());
	        }

	        // Deserialize
	        try (ObjectInputStream ois =
	                     new ObjectInputStream(new FileInputStream("emp.dat"))) {

	            List<Employee> data = (List<Employee>) ois.readObject();

	            for (Employee e : data) {
	                System.out.println(e);
	            }

	        } catch (IOException | ClassNotFoundException e) {
	            System.out.println("Read error: " + e.getMessage());
	        }
	    }
	}


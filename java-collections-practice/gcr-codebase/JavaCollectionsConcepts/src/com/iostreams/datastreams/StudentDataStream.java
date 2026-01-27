package com.iostreams.datastreams;

import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {

        String file = "student.dat";

        // Write data
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(file))) {

            dos.writeInt(101);
            dos.writeUTF("Ishan");
            dos.writeDouble(8.75);

            System.out.println("Student data saved.");

        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }

        // Read data
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(file))) {

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Roll: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}

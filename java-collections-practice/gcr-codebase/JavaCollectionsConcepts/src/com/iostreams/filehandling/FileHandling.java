package com.iostreams.filehandling;

import java.io.*;


public class FileHandling {
	public static void main(String[] args) {
		File source = new File("C:\\Users\\Hp\\OneDrive\\Desktop\\Java Programming Workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsConcepts\\src\\com\\iostreams\\filehandling\\source.txt");
		File destinationFile = new File("destination.txt");
		
		if(!source.exists()) {
			System.out.println("Source file does not match");
		return;
		}
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream = new FileInputStream(source);
			fileOutputStream = new FileOutputStream(destinationFile);
			
			int data;
			while((data = fileInputStream.read()) != -1) {
				fileOutputStream.write(data);
			}
			System.out.println("File copied Succesfully");
			
		}
		catch(IOException e) {
			System.out.println("Error while reading or writing file: " + e.getMessage());	
		}
		finally {
			try {
				if(fileInputStream != null) fileInputStream.close();
				if(fileOutputStream!=null) fileOutputStream.close();
				
			}
			catch(IOException e) {
				System.out.println("Errro while closing file");
			}
		}
		
	}
}

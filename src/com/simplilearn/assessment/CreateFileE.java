package com.simplilearn.assessment;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;



public class CreateFileE {
	
	
void fileCreate() {
	String paath = "C:\\temp\\";
	Scanner sc = new Scanner(System.in); // object of Scanner class
	System.out.println(" ");
	System.out.print("Enter the file name: ");
	String x = sc.nextLine();

	Path path = Paths.get(paath + x);
	// creates Path instance
	
	try
	{
		Path p = Files.createFile(path); // creates file at specified location
		System.out.println("File Created at Path: " + p);
	}
	catch(IOException e)
	{System.out.println(" ");
		System.out.println("File exists");
		System.out.println(" ");
		System.out.println("enter a different name");
		fileCreate();
//e.printStackTrace();
	}
}
}

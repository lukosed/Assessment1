package com.simplilearn.assessment;

import java.io.File;
import java.io.IOException; 
import java.nio.file.*; 
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DeleteFile1 {
	
	void delteFile()
    { 
        try
        { 
        	String pp="C:\\Program Files";
        	System.out.println("enter file name to delete");
        	
        	Scanner destFile= new Scanner(System.in);
        	String x = destFile.nextLine();
        	//System.out.println(pp+x);
        	
        	
        	File file = new File(pp+x);
            //if(file.toString().equalsIgnoreCase(file.toString())) {
        	if(file.toString().equals(file.toString())) {
            Files.delete(Paths.get(pp+x)); 
            
            System.out.println(x+"   file deleted");
            }

            } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
            
            
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        //System.out.println("Deletion successful."); 
    } 
	
} 
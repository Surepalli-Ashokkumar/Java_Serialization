package com.cisco.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable
{
    
	private int id;
	private String name;
	private transient String email;
	private String password;
	
	
	public Student(int id, String name,String email,String password)
    {
    	this.id=id;
    	this.name=name;
    	this.email=email;
    	this.password=password;
    	
    }
	public void display()
	{
		System.out.println(id+" "+name+" "+email+" "+password+" ");
		
	}
	
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "test", "test@gmail.com", "test@123");
		s1.display();
	}
		// for storing the file in specified path
	FileOutputStream fileout;
	try 
	{
		fileout= new FileOutputStream(null);
		ObjectOutputStream out = new ObjectOutputStream(fileout);
		out.writeObject(s1);
		fileout.close();
		System.out.println("Data saved successfully");
	}
	catch()
	{
		
	}
}

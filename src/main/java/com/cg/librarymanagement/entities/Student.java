package com.cg.librarymanagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentid;
	private String studenrollment;
	private String studname;
	private String studemail;
	private String studpassword;
	private int studcontact;
	
	
	public int getStudentid() 
	{
		return studentid;
	}
	
	public void setStudentid(int studentid)
	{
		this.studentid = studentid;
	}
	
	public String getStudenrollment() 
	{
		return studenrollment;
	}
	
	public void setStudenrollment(String studenrollment) 
	{
		this.studenrollment = studenrollment;
	}
	
	public String getStudname() 
	{
		return studname;
	}
	
	public void setStudname(String studname) 
	{
		this.studname = studname;
	}
	
	public String getStudemail() 
	{
		return studemail;
	}
	
	public void setStudemail(String studemail) 
	{
		this.studemail = studemail;
	}
	
	public String getStudpassword()
	{
		return studpassword;
	}
	
	public void setStudpassword(String studpassword) 
	{
		this.studpassword = studpassword;
	}
	
	public int getStudcontact()
	{
		return studcontact;
	}
	
	public void setStudcontact(int studcontact)
	{
		this.studcontact = studcontact;
	}
	
}

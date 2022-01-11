package com.cg.librarymanagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Librarian 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int libid;
	private String libname;
	private String libemail;
	private String libpassword;
	private String libcontact;
	
	public int getLibid() 
	{
		return libid;
	}
	
	public void setLibid(int libid)
	{
		this.libid = libid;
	}
	
	public String getLibname() 
	{
		return libname;
	}
	
	public void setLibname(String libname)
	{
		this.libname = libname;
	}
	
	public String getLibemail()
	{
		return libemail;
	}
	
	public void setLibemail(String libemail)
	{
		this.libemail = libemail;
	}
	
	public String getLibpassword()
	{
		return libpassword;
	}
	
	public void setLibpassword(String libpassword)
	{
		this.libpassword = libpassword;
	}
	
	public String getLibcontact()
	{
		return libcontact;
	}
	
	public void setLibcontact(String libcontact) 
	{
		this.libcontact = libcontact;
	}
}

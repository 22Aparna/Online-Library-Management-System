package com.cg.librarymanagement.entities;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Returnbook 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int returnId;
	private int bookid;
	private int studentid;
	private Date returndate;
	
	public int getReturnId() 
	{
		return returnId;
	}
	
	public void setReturnId(int returnId)
	{
		this.returnId = returnId;
	}
	
	public Date getReturndate() 
	{
		return returndate;
	}
	
	public int getBookid() 
	{
		return bookid;
	}
	
	public void setBookid(int bookid)
	{
		this.bookid = bookid;
	}
	
	public int getStudentid() 
	{
		return studentid;
	}
	
	public void setStudentid(int studentid) 
	{
		this.studentid = studentid;
	}
	
	public void setReturndate(Date returndate) 
	{
		this.returndate = returndate;
	}
	
}



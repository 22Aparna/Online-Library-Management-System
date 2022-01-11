package com.cg.librarymanagement.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Issuebook
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int issueid;
    private int bookid;
    private int studentid;
	private Date issuedate;
	private String returnstatus;
	
	public int getIssueid()
	{
		return issueid;
	}
	
	public void setIssueid(int issueid) 
	{
		this.issueid = issueid;
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
	
	public Date getIssuedate()
	{
		return issuedate;
	}
	
	public void setIssuedate(Date issuedate)
	{
		this.issuedate = issuedate;
	}
	
	public String getReturnstatus()
	{
		return returnstatus;
	}
	
	public void setReturnstatus(String returnstatus) 
	{
		this.returnstatus = returnstatus;
	}
	
	
}

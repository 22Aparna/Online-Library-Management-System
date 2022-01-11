package com.cg.librarymanagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookid;
	private String bookcallno;
	private String bookname;
	private String bookauthor;
	private String bookpublisher;
	private int bookcopies;
    private int bookissued;
	
   
	public int getBookid() 
	{
		return bookid;
	}
	
	public void setBookid(int bookid) 
	{
		this.bookid = bookid;
	}
	
	public String getBookcallno() 
	{
		return bookcallno;
	}
	
	public void setBookcallno(String bookcallno) 
	{
		this.bookcallno = bookcallno;
	}
	
	public String getBookname() 
	{
		return bookname;
	}
	
	public void setBookname(String bookname) 
	{
		this.bookname = bookname;
	}
	
	public String getBookauthor() 
	{
		return bookauthor;
	}
	
	public void setBookauthor(String bookauthor) 
	{
		this.bookauthor = bookauthor;
	}
	
	public String getBookpublisher() 
	{
		return bookpublisher;
	}
	
	public void setBookpublisher(String bookpublisher)
	{
		this.bookpublisher = bookpublisher;
	}
	
	public int getBookcopies() 
	{
		return bookcopies;
	}
	
	public void setBookcopies(int bookcopies)
	{
		this.bookcopies = bookcopies;
	}
	
	public int getBookissued() 
	{
		return bookissued;
	}
	
	public void setBookissued(int bookissued) 
	{
		this.bookissued = bookissued;
	}
	
  }

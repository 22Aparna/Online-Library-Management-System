package com.cg.librarymanagement.service;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.librarymanagement.entities.Book;
import com.cg.librarymanagement.entities.Issuebook;
import com.cg.librarymanagement.entities.Librarian;
import com.cg.librarymanagement.entities.Returnbook;
import com.cg.librarymanagement.repository.IBookRepository;
import com.cg.librarymanagement.repository.IIssueBookRepository;
import com.cg.librarymanagement.repository.ILibrarianRepository;
import com.cg.librarymanagement.repository.IReturnBookRepository;

@Service
public class ILibrarianService 
{
	    //Librarian login
		@Autowired
		ILibrarianRepository librarianRepository;
		public String loginLibrarian(String libemail,String libpassword)
		{
			List<Librarian> librarianList=librarianRepository.findByLogin(libemail, libpassword);
			if(librarianList.size()==1)
			{
				return "success";
			}
			else
			{
				return "fail";
			}
		}
	
	
		//Add book
		@Autowired
		IBookRepository bookRepository;
		public void addBook(Book book)
		{
			bookRepository.save(book);
		}
	
	
		
	   //Issue book
		@Autowired
		IIssueBookRepository issueBookRepository;
		public void issueBook(int bookid,int studentid,Date issuedate)
		{
			Issuebook issueBook=new Issuebook();
			issueBook.setBookid(bookid);
			issueBook.setStudentid(studentid);
			issueBook.setIssuedate(issuedate);
			issueBook.setReturnstatus("No");
			issueBookRepository.save(issueBook);
	    }
	
		
		//Return book
		@Autowired
		IReturnBookRepository returnBookRepository;
		public void returnBook(int bookid,int studentid,Date returndate)
		{
			Returnbook returnBook=new Returnbook();
			returnBook.setBookid(bookid);
			returnBook.setStudentid(studentid);
			returnBook.setReturndate(returndate);
			returnBookRepository.save(returnBook);
		}
	
		
		//View Book
		public List<Book> viewBook()
		{
			List<Book> bookList=(List<Book>) bookRepository.findAll();
			return bookList;
		}
		
		
		//View Issued books
		public List<Issuebook> viewIssueBook()
		{
			List<Issuebook> issueBookList=(List<Issuebook>) issueBookRepository.findAll();
			return issueBookList;
		}
					
		
		//Update issue book count in book table after issue book
		public void editBook(int bookid)
		{
			Book book=bookRepository.findById(bookid);
			int issuebookcount=book.getBookissued();
			issuebookcount=issuebookcount+1;
			book.setBookissued(issuebookcount);
			bookRepository.save(book);
		}
	
		
		//Update issue book count in book table after return book
	     public void editBooks(int bookid)
		{
			Book book=bookRepository.findById(bookid);
			int issuecount=book.getBookissued();
			issuecount=issuecount-1;
			book.setBookissued(issuecount);
			bookRepository.save(book);
		}
		
		//update return status of book after return book
		public void editReturnStatus(int bookid)
		{
			Issuebook issueBook=issueBookRepository.findById(bookid);
			issueBook.setReturnstatus("Yes");
			issueBookRepository.save(issueBook);
		}
}

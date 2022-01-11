package com.cg.librarymanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.librarymanagement.entities.Book;
import com.cg.librarymanagement.entities.Issuebook;
import com.cg.librarymanagement.entities.Student;
import com.cg.librarymanagement.repository.IBookRepository;
import com.cg.librarymanagement.repository.IIssueBookRepository;
import com.cg.librarymanagement.repository.IStudentRepository;

@Service
public class IStudentService 
{
	  
	    //Student login
		@Autowired
		IStudentRepository studentRepository;
	    public String loginStudent(String studemail,String studpassword)
		{
			List<Student> studentList=studentRepository.findByLogin(studemail, studpassword);
			if(studentList.size()==1)
			{
				return "success";
			}
			else
			{
				return "fail";
			}
		}
	
	    
		//View Book
		@Autowired
		IBookRepository bookRepository;
	    public List<Book> viewBooks()
		{
			List<Book> bookList=(List<Book>) bookRepository.findAll();
			return bookList;
		}
		
	    

		//View Issued books
		@Autowired
		IIssueBookRepository issueBookRepository;
		public List<Issuebook> viewIssueBook(int studentid)
		{
			List<Issuebook> issuebook=(List<Issuebook>) issueBookRepository.findByStudId(studentid);
			return issuebook;
		}
		
		
		//View Student Profile find by email
		/*public List<Student> viewStudent(String studemail)
		{
			List<Student> studlist=studentRepository.findByEmail(studemail);
			return studlist;
		}*/
		
		
		public List<Student> viewStudentProfile(String studemail)
		{
			List<Student> studlist=(List<Student>) studentRepository.findByEmail(studemail);
			return studlist;
		}
}




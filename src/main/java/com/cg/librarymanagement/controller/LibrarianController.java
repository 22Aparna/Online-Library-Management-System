package com.cg.librarymanagement.controller;

import java.sql.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.librarymanagement.entities.Book;
import com.cg.librarymanagement.entities.Issuebook;
import com.cg.librarymanagement.service.ILibrarianService;


@Controller
public class LibrarianController
 {
		@Autowired
		ILibrarianService librarianService;
	
		//Librarian login
		@RequestMapping("/LibrarianLogin")
		@PostMapping
		public ModelAndView librarianLoginResponse(@RequestParam("libemail") String libemail,@RequestParam("libpassword") String libpassword)
		{
			ModelAndView modelAndView=new ModelAndView();

			if(librarianService.loginLibrarian(libemail,libpassword).equals("success"))
			{
				modelAndView.setViewName("LibrarianHome.jsp");
				modelAndView.addObject("librarianinfo","libemail");
			}
			else 
			{
				modelAndView.setViewName("index.jsp");
				modelAndView.addObject("statement","invalid email or password.. Please login again");
			}
			return modelAndView;
		}
	
	
		//Add book
		@RequestMapping("/addBook")
		public ModelAndView addBook(Book book)
		{ 
			librarianService.addBook(book);
			ModelAndView mv=new ModelAndView();
			mv.addObject("bookInfo", book);
			mv.setViewName("LibrarianHome.jsp");
			return mv;
		}
	
	
		//Issue book
		@RequestMapping("/issueBook")
		public ModelAndView issueBook(@RequestParam("bookId") int bookId,@RequestParam("studentid") int studentid,@RequestParam("issuedate") Date issuedate)
		{
			ModelAndView modelAndView=new ModelAndView();
			librarianService.issueBook(bookId, studentid, issuedate);
			librarianService.editBook(bookId);
			modelAndView.setViewName("LibrarianHome.jsp");
			return modelAndView;
		}
	
	
		//Return book
		@RequestMapping("/returnBook")
		public ModelAndView returnBook(@RequestParam("bookid") int bookid,@RequestParam("studentid") int studentid,@RequestParam("returndate") Date returndate)
		{
			ModelAndView modelAndView=new ModelAndView();
			librarianService.returnBook(bookid, studentid, returndate);
			librarianService.editBooks(bookid);
			librarianService.editReturnStatus(bookid);
			modelAndView.setViewName("LibrarianHome.jsp");
			return modelAndView;
		}
	
		
		//View book
		@RequestMapping("/viewBook")
		public ModelAndView viewBook()
		{
			ModelAndView modelAndView=new ModelAndView();
			List<Book> booklist=librarianService.viewBook();
			modelAndView.addObject("bookinfo", booklist);
			modelAndView.setViewName("ViewBook.jsp");
			return modelAndView;
		}
	
		//View Issued Books
		@RequestMapping("/viewIssuedBook")
		public ModelAndView viewIssuedBook()
		{
			ModelAndView modelAndView=new ModelAndView();
			List<Issuebook> issueBookList=librarianService.viewIssueBook();
			modelAndView.addObject("issueInfo", issueBookList);
			modelAndView.setViewName("ViewIssuedBook.jsp");
			return modelAndView;
		}
	
}

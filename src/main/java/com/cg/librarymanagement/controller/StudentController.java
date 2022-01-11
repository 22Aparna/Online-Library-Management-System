package com.cg.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.librarymanagement.entities.Book;
import com.cg.librarymanagement.entities.Issuebook;
import com.cg.librarymanagement.entities.Student;
import com.cg.librarymanagement.service.IStudentService;


@Controller
public class StudentController 
{
		@Autowired
		IStudentService studentService;
	
		//Student login
	    @RequestMapping("/StudentLogin")
	    @PostMapping
	    public ModelAndView showLoginResponse(@RequestParam("studemail") String studemail,@RequestParam("studpassword") String studpassword)
	   {
	    	ModelAndView modelAndView=new ModelAndView();
	    	if(studentService.loginStudent(studemail,studpassword).equals("success"))
	    	{
	    		modelAndView.setViewName("StudentHome.jsp");
	    		modelAndView.addObject("studentinfo","studemail");
	    	}
	    	else 
	    	{
	    		modelAndView.setViewName("index.jsp");
	    		modelAndView.addObject("statement","invalid email or password.. Please login again");
	    	}
	    	return modelAndView;
	   }
	

	    //View book
		@RequestMapping("/viewBooks")
		public ModelAndView viewBooks()
		{
			ModelAndView modelAndView=new ModelAndView();
			List<Book> booklist=studentService.viewBooks();
			modelAndView.addObject("bookinfo", booklist);
			modelAndView.setViewName("ViewBook.jsp");
			return modelAndView;
		}
			
			
		//View issued books
		@RequestMapping("/viewIssueBook")
		public ModelAndView viewIssueBook(@RequestParam("studentid") int studentid)
		{
			ModelAndView modelAndView=new ModelAndView();
			List<Issuebook> issuebooklist=studentService.viewIssueBook(studentid);
			modelAndView.addObject("IssueBook", issuebooklist);
			modelAndView.setViewName("StudentIssuedBook.jsp");
			return modelAndView;
		}
			
	 
	    //View student profile
		@RequestMapping("/studentProfile")
		public ModelAndView studentProfile(@RequestParam("studemail") String studemail)
		{
			ModelAndView modelAndView=new ModelAndView();
			List<Student> studlist=studentService.viewStudentProfile(studemail);
			//Student stud=studlist.get(0);
			modelAndView.addObject("Student", studlist);
			modelAndView.setViewName("StudentProfile.jsp");
			return modelAndView;
		}
			
}

	



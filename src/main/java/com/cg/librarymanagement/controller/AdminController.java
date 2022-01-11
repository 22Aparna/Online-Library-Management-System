package com.cg.librarymanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.librarymanagement.entities.Librarian;
import com.cg.librarymanagement.entities.Student;
import com.cg.librarymanagement.service.IAdminService;

@Controller
public class AdminController 
{
		//Inject object dependency implicitly
		@Autowired
		IAdminService adminService;
	
		@RequestMapping("/")
		public String homePage()
		{
			return "index.jsp";
		}
	
		//Admin login
		@RequestMapping("/AdminLogin")
		@PostMapping
		public ModelAndView adminLoginResponse(@RequestParam("Adname") String Adname,@RequestParam("Adpassword") String Adpassword)
		{
			ModelAndView modelAndView=new ModelAndView();
			if(adminService.loginAdmin(Adname,Adpassword).equals("success"))
			{
				modelAndView.setViewName("AdminHome.jsp");
				modelAndView.addObject("admininfo","Adname");
			}
			else 
			{
				modelAndView.setViewName("index.jsp");
				modelAndView.addObject("statement","invalid Username or password.. Please login again");
			}
			return modelAndView;
		}
	
	
		//Add librarian
		@RequestMapping("/addLibrarian")
		@PostMapping
		public ModelAndView addLibrarian(Librarian librarian)
		{
			ModelAndView mv=new ModelAndView();
			adminService.addLibrarian(librarian);
			mv.setViewName("AdminHome.jsp");
			return mv;
		}
	
		
		//Add student
		@RequestMapping("/addStudent")
		@PostMapping
		public ModelAndView addStudent(Student student)
		{
			ModelAndView mv=new ModelAndView();
			adminService.addStudent(student);
			mv.setViewName("AdminHome.jsp");
			return mv;
		}
	
	
	
		//Edit librarian
		@RequestMapping("/editLibrarian")
		@PostMapping
		public ModelAndView editLibrarian(@RequestParam("libid") int libid,@RequestParam("libname") String libname,@RequestParam("libemail") String libemail,@RequestParam("libpassword") String libpassword,@RequestParam("libcontact") String libcontact)
		{
			ModelAndView mv=new ModelAndView();
			adminService.editLibrarian(libid,libname,libemail,libpassword,libcontact);
			mv.setViewName("AdminHome.jsp");
			return mv;
		}
	
	
		//Edit student
		@RequestMapping("/editStudent")
		@PostMapping
		public ModelAndView editStudent(@RequestParam("Studentid") int Studentid,@RequestParam("studenrollment") String studenrollment,@RequestParam("studname") String studname,@RequestParam("studemail") String studemail,@RequestParam("studpassword") String studpassword,@RequestParam("studcontact") int studcontact)
		{
			ModelAndView mv=new ModelAndView();
			adminService.editStudent(Studentid, studenrollment, studname, studemail, studpassword, studcontact);
			mv.setViewName("AdminHome.jsp");
			return mv;
		}
	
	
		//View librarian
		@RequestMapping("/viewLibrarian")
		public ModelAndView viewLibrarian()
		{
			ModelAndView mv=new ModelAndView();
			List<Librarian> librarianlist=adminService.viewLibrarian();
			mv.addObject("librarianinfo", librarianlist);
			mv.setViewName("ViewLibrarian.jsp");
			return mv;
		}
	
		
		//Delete librarian
		@RequestMapping("/deleteLibrarians")
		public ModelAndView deleteLibrarian(@RequestParam("libid") int libid)
		{
			ModelAndView mv=new ModelAndView();
			adminService.deleteLibrarian(libid);
			mv.setViewName("AdminHome.jsp");
			return mv;
		}
	
	
		//View student
		@RequestMapping("/viewStudent")
		public ModelAndView viewStudent()
		{
			ModelAndView modelAndView=new ModelAndView();
			List<Student> studentlist=adminService.viewStudent();
			modelAndView.addObject("studentinfo", studentlist);
			modelAndView.setViewName("ViewStudent.jsp");
			return modelAndView;
		}
	
	
		
}

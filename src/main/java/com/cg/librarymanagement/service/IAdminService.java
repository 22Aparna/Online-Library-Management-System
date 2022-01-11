package com.cg.librarymanagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.librarymanagement.entities.Admin;
import com.cg.librarymanagement.entities.Librarian;
import com.cg.librarymanagement.entities.Student;
import com.cg.librarymanagement.repository.IAdminRepository;
import com.cg.librarymanagement.repository.ILibrarianRepository;
import com.cg.librarymanagement.repository.IStudentRepository;

@Service
public class IAdminService 
{
		//Admin login
		@Autowired
		IAdminRepository adminRepository;
		public String loginAdmin(String Adname,String Adpassword)
		{
			List<Admin> adminList=adminRepository.findByLogin(Adname, Adpassword);
			if(adminList.size()==1)
			{
				return "success";
			}
			else
			{
				return "fail";
			}
		}
	
		
		//Add Librarian
		@Autowired
		ILibrarianRepository librarianRepository;
		public void addLibrarian(Librarian librarian)
		{
			librarianRepository.save(librarian);
		}
	
	
		//Add student
		@Autowired
		IStudentRepository studentRepository;
		public void addStudent(Student student)
		{
			studentRepository.save(student);
		}
	
		
		//Edit librarian
		public void editLibrarian(int libid,String libname,String libemail,String libpassword,String libcontact)
		{
			Librarian lib=librarianRepository.findById(libid);
			lib.setLibname(libname);
			lib.setLibemail(libemail);
			lib.setLibpassword(libpassword);
			lib.setLibcontact(libcontact);
			librarianRepository.save(lib);
		}
		
		
		//Edit student
		public void editStudent(int studentid,String studenrollment,String studname,String studemail,String studpassword,int studcontact)
		{
			Student student=studentRepository.findById(studentid);
			student.setStudenrollment(studenrollment);
			student.setStudname(studname);
			student.setStudemail(studemail);
			student.setStudpassword(studpassword);
			student.setStudcontact(studcontact);
			studentRepository.save(student);
		}
			
			
		//View librarian
		public List<Librarian> viewLibrarian()
		{
			List<Librarian> librarianList=(List<Librarian>) librarianRepository.findAll();
			return librarianList;
		}
	
	
		//Delete librarian
		public void deleteLibrarian(int libid)
		{
			librarianRepository.deleteById(libid);
		}
			
			
		//View Student
		public List<Student> viewStudent()
		{
			List<Student> studentList=(List<Student>) studentRepository.findAll();
			return studentList;
		}
	
	   
		
		
		
}

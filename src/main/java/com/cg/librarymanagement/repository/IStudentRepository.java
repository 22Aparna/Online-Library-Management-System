package com.cg.librarymanagement.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.librarymanagement.entities.Issuebook;
import com.cg.librarymanagement.entities.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student,Integer>
{
	//Student login
	@Query("from Student where studemail=?1 and studpassword=?2")
	List<Student> findByLogin(String studemail,String studpassword);
	
	//Edit student
	Student findById(int studentid);
	
	//View Student Profile
	@Query("from Student where studemail=?1")
	List<Student> findByEmail(String studemail);
	



}


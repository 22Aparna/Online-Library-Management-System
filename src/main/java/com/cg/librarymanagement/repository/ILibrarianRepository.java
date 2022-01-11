package com.cg.librarymanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.cg.librarymanagement.entities.Librarian;


public interface ILibrarianRepository extends CrudRepository<Librarian,Integer>
{
	//Librarian login
	@Query("from Librarian where libemail=?1 and libpassword=?2")
	List<Librarian> findByLogin(String libemail,String libpassword);
	
	//Edit librarian
	Librarian findById(int libid);
}
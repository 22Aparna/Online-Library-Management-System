package com.cg.librarymanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cg.librarymanagement.entities.Admin;

@Repository
public interface IAdminRepository extends CrudRepository<Admin,Integer>
{
	    //Admin login
		@Query("from Admin where Adname=?1 and Adpassword=?2")
		List<Admin> findByLogin(String Adname,String Adpassword);
}
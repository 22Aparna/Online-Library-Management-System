package com.cg.librarymanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.cg.librarymanagement.entities.Issuebook;


public interface IIssueBookRepository extends CrudRepository<Issuebook,Integer>
{
	Issuebook findById(int bookid);

	//view issued books
    @Query("from Issuebook where studentid=?1")
	List<Issuebook> findByStudId(int studentid);
}
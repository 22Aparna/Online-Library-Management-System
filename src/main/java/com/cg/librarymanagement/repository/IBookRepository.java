package com.cg.librarymanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cg.librarymanagement.entities.Book;

@Repository
public interface IBookRepository extends CrudRepository<Book,Integer> 
{
	//Edit book
	Book findById(int bookid);
}
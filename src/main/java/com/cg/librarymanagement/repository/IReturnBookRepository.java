package com.cg.librarymanagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.cg.librarymanagement.entities.Returnbook;

public interface IReturnBookRepository extends CrudRepository<Returnbook,Integer>
{

}
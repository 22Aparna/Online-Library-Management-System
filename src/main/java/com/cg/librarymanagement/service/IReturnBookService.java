package com.cg.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.librarymanagement.repository.IReturnBookRepository;

@Service
public class IReturnBookService 
{
	@Autowired
	IReturnBookRepository returnBookRepository;
}


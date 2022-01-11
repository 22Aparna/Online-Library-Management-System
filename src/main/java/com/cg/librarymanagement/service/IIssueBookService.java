package com.cg.librarymanagement.service;

import org.springframework.stereotype.Service;
import com.cg.librarymanagement.repository.IIssueBookRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class IIssueBookService 
{
	@Autowired
	IIssueBookRepository issueBookRepository;
}

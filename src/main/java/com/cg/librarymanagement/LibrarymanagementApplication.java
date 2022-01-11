package com.cg.librarymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.cg.librarymanagement","com.cg.librarymanagement.controller","com.cg.librarymanagement.entities","com.cg.librarymanagement.repository"})
@EntityScan({"com.cg.librarymanagement","com.cg.librarymanagement.controller","com.cg.librarymanagement.entities","com.cg.librarymanagement.repository"})
@EnableJpaRepositories({"com.cg.librarymanagement","com.cg.librarymanagement.controller","com.cg.librarymanagement.entities","com.cg.librarymanagement.repository"})
public class LibrarymanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementApplication.class, args);
	}

}

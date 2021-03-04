package com.ymsli.companyapp.controller;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ymsli.companyapp.dao.Department;
import com.ymsli.companyapp.service.CompanyService;

@RestController

public class CompanyRestController {

	private CompanyService companyService;

	@Autowired

	public CompanyRestController(CompanyService companyService) {

		this.companyService = companyService;

	}

// ========get all books==========

	@GetMapping(path = "book", produces = MediaType.APPLICATION_JSON_VALUE)

	public ResponseEntity<Iterable<Department>> getAllBooks() {

		Iterable<Department> departments = companyService.getAllDepartments();

//System.out.println(1/0);

		return new ResponseEntity<Iterable<Department>>(departments, HttpStatus.OK);

	}

	/*
	 * // ========get an book by id==========
	 * 
	 * @GetMapping(path = "book/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	 * 
	 * public ResponseEntity<Book> getAnBook(@PathVariable(name = "id") int bookId)
	 * {
	 * 
	 * return ResponseEntity.ok(companyService.getBookById(bookId));
	 * 
	 * }
	 * 
	 * // ========add a book==========
	 * 
	 * @PostMapping(path = "book",
	 * 
	 * produces = MediaType.APPLICATION_JSON_VALUE,
	 * 
	 * consumes = MediaType.APPLICATION_JSON_VALUE)
	 * 
	 * public ResponseEntity<Book> addAnBook(@Valid @RequestBody Book book) {
	 * 
	 * Book bookAdded = companyService.addBook(book);
	 * 
	 * return new ResponseEntity<Book>(bookAdded, HttpStatus.CREATED);
	 * 
	 * }
	 * 
	 * // ========update a book==========
	 * 
	 * @PutMapping(path = "book/{id}",
	 * 
	 * produces = MediaType.APPLICATION_JSON_VALUE,
	 * 
	 * consumes = MediaType.APPLICATION_JSON_VALUE)
	 * 
	 * public ResponseEntity<Book> updateAnBook(@PathVariable(name = "id") int
	 * bookId, @RequestBody Book book) {
	 * 
	 * return new ResponseEntity<Book>(companyService.updateBook(bookId, book),
	 * HttpStatus.OK);
	 * 
	 * }
	 * 
	 * // ========delete an book by id==========
	 * 
	 * @DeleteMapping(path = "book/{id}", produces =
	 * MediaType.APPLICATION_JSON_VALUE)
	 * 
	 * public ResponseEntity<Void> deleteAnBook(@PathVariable(name = "id") int
	 * bookId) {
	 * 
	 * companyService.removeBook(bookId);
	 * 
	 * return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	 * 
	 * }
	 */

}

package com.ymsli.companyapp.service;

import java.awt.print.Book;

import com.ymsli.companyapp.dao.Department;
import com.ymsli.companyapp.dao.Employee;
import com.ymsli.companyapp.dao.Project;

public interface CompanyService {
	public Iterable<Department> getAllDepartments();

	public Department getDepartmentByName(String dname);

	public Iterable<Employee> getAllEmployeesDep(String dname);

	public Iterable<Project> getProjectByEmployee(String name);
}
package com.ymsli.companyapp.service;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;

import com.ymsli.companyapp.dao.Department;
import com.ymsli.companyapp.dao.Employee;
import com.ymsli.companyapp.dao.Project;
import com.ymsli.companyapp.repository.DepartmentRepository;
import com.ymsli.companyapp.repository.EmployeeRepository;
import com.ymsli.companyapp.repository.ProjectRepository;

public class CompanyServiceImpl implements CompanyService {

	private DepartmentRepository depRepo;
	private EmployeeRepository empRepo;
	private ProjectRepository proRepo;

	@Autowired
    public CompanyServiceImpl(DepartmentRepository depRepo, EmployeeRepository empRepo,ProjectRepository proRepo) {
        this.depRepo = depRepo;
        this.empRepo = empRepo;
        this.proRepo = proRepo;
    }

//	@MyLogger
//	@Override
	public Iterable<Department> getAllDepartments() {
		System.out.println("---------getAllDepartments is called--");
		return depRepo.findAll();

	}

//	@Cacheable(value = "mycache", key = "#bookId")
//	@Override
	public Department getDepartmentByName(String dname) {
		return null;
				
	}

	@Override
	public Iterable<Employee> getAllEmployeesDep(String dname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Project> getProjectByEmployee(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
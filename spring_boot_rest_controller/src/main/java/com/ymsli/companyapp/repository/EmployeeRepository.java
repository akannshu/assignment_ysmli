package com.ymsli.companyapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ymsli.companyapp.dao.Employee;

 
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}

 


 
 

 


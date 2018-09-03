package com.example.spring;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.stereotype.Service;


@Service	//For declear that class is in service layer (Autowire)
@EnableCouchbaseRepositories(basePackages= {"com.example.spring"})
public class EmployeeService implements IEmployeeService{

	@Autowired
	IEmployeeRepo empRepo;
	
	@Override
	public Optional<Employee> getEmployeeById(long empId) {
		System.out.println("Find By Id "+empRepo.findById(empId));
		return empRepo.findById(empId);
	}

	
	@Override
	public List<Employee> fetchAllEmployee(){
		List<Employee> empList = new ArrayList<Employee>();
		System.out.println("Find All "+empRepo.findAll());
		for (Employee employee : empRepo.findAll()) {
			empList.add(employee);
		}
		return empList;
	}
	@Override
	public Employee addEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public void deleteEmployee(long empId) {
		empRepo.deleteById(empId);
	}

	@Override
	public boolean isValid(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}
	

}

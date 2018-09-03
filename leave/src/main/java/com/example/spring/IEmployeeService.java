package com.example.spring;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
	
	public Optional<Employee> getEmployeeById(long empId);
	public List<Employee> fetchAllEmployee();
	public Employee addEmployee(Employee emp);
	public void deleteEmployee(long empId);
	public boolean isValid(Employee emp);
}

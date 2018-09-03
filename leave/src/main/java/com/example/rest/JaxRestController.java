package com.example.rest;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.stereotype.Component;

import com.example.spring.Employee;
import com.example.spring.IEmployeeService;

@Component	//For declation of class as Controller (Autowiring)
@Path("/ved")
@EnableCouchbaseRepositories(basePackages= {"com.example.spring"})
public class JaxRestController {
	

	//create object of Inteface IEmloyeeService to call EmployeeService Methods
	@Autowired
	IEmployeeService empService;
	
	@GET	//for Get type of request
	@Path("/employee/{empId}")	//hiting url path
	@Produces(MediaType.APPLICATION_JSON)
	public Optional<Employee> getEmployee(@PathParam("empId") long empId){
		System.out.println("Started to fetch All Employee");
		//ObjectMapper mapper = new ObjectMapper();	//Just to convert Java Object to JSON type data.
		//String jsonData = mapper.writeValueAsString(e);	//Its actually converting the Object to JSON data
		//return Response.status(200).entity(jsonData).build();	//To return proper data with status code success
		return empService.getEmployeeById(empId);
	}
	
	@GET
	@Path("/employees")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> fetchAllEmployee(){
		System.out.println("Fetch All Employee Started");
		return empService.fetchAllEmployee();
	}
	
	@POST	//for Post type of method
	@Path("/add")	//hiting url path
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addEmployee(Employee emp) throws IOException {
		System.out.println("Add New Employee Started");
		return empService.addEmployee(emp);
	}
	
	@POST
	@Path("/validate")	//hiting url path
	public Response validateUser(Employee emp) {
		System.out.println("Validation Started");
		return Response.status(200).entity("Valid: "+ empService.isValid(emp)).build();	//To return proper data with status code success
	}
	
	@POST
	@Path("/delete/{empId}")	//hiting url path with path parameter. the empId will be the same value which mentioned in URL ie /delete/12345. so empId=12345
	public Response deleteUser(@PathParam("empId") long empId) {
		System.out.println("Delete Method Started");
		empService.deleteEmployee(empId);
		return Response.status(200).entity("Successfully deleted employee with id "+empId).build(); //To return proper data with status code success
		
	}
	
}

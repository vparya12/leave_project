package com.example.spring;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CouchbaseRepository<Employee, Long>{

}

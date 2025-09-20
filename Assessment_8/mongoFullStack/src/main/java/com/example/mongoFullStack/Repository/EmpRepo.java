package com.example.mongoFullStack.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongoFullStack.Model.Employee;



public interface EmpRepo  extends MongoRepository<Employee,String> {
    
}

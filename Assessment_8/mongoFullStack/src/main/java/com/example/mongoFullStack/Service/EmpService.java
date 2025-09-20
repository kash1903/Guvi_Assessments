package com.example.mongoFullStack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.example.mongoFullStack.Model.Employee;
import com.example.mongoFullStack.Repository.EmpRepo;

import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    EmpRepo empRepo;

    // Get all employees
    public ResponseEntity<?> getAllEmployee() {
        return ResponseEntity.ok(empRepo.findAll());
    }

   // Get employee by empId
// Get employee by empId
public ResponseEntity<?> getEmpByEmpId(Integer empId) {
    // search for employee with matching empId
    Optional<Employee> employee = empRepo.findAll()
                                         .stream()
                                         .filter(e -> e.getEmpId() != null && e.getEmpId().equals(empId))
                                         .findFirst();

    if (employee.isPresent()) {
        return ResponseEntity.ok(employee.get());
    } else {
        return ResponseEntity.status(404)
                             .body("Employee with empId " + empId + " not found");
    }
}



    // Add data
    public ResponseEntity<?> insertEmpData(Employee employee) {
        empRepo.save(employee);
        return ResponseEntity.ok(employee);
    }

   // updating data by checking id exist since we have implementd auto increment
    public ResponseEntity<?> updateEmpData(Employee employee) {
        // Find existing employee by empId
        Optional<Employee> existing = empRepo.findAll()
                .stream()
                .filter(e -> e.getEmpId() != null && e.getEmpId().equals(employee.getEmpId()))
                .findFirst();

        if (existing.isPresent()) {
            // Set the _id of incoming object to existing _id
            employee.setId(existing.get().getId());
            empRepo.save(employee);  // now it will update instead of insert
            return ResponseEntity.ok(employee); // Updated successfully
        } else {
            return ResponseEntity.status(404)
                    .body("Employee with empId " + employee.getEmpId() + " not found");
        }
    }

    // Delete data (optional)
    // public ResponseEntity<?> removeEmpData(String id){
    //     empRepo.deleteById(id);
    //     return ResponseEntity.ok(id);
    // }
}

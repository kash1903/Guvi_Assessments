package com.example.mongoFullStack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoFullStack.Model.Employee;
import com.example.mongoFullStack.Service.EmpService;

@RestController
@CrossOrigin(origins = "*")
public class EmpController {

    @Autowired

    EmpService empService;

    @GetMapping("/displayAll")

    public ResponseEntity<?> getAllUser() {

        // return ResponseEntity.ok(empService.getAllEmployee());
        return empService.getAllEmployee();
    }


    // find by id 

    @GetMapping("/display/{empId}")
public ResponseEntity<?> getEmpByEmpId(@PathVariable Integer empId) {
    return empService.getEmpByEmpId(empId);
}


    @PostMapping("/add")

    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {

        return empService.insertEmpData(employee);
    }

    @PutMapping("/update")

    public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {

        return empService.updateEmpData(employee);
    }

    @DeleteMapping("/remove/{id}")

    public ResponseEntity<?> removeEmployeData(@PathVariable String id) {

        return ResponseEntity.ok("Employee Deleted succesfully");

    }

}

package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Employee;
import com.example.spring.service.EmployeeService;

@RestController
public class EmployeeController {

   @Autowired
   private EmployeeService employeeService;

   /*---Add new employee---*/
   @PostMapping("/employee")
   public ResponseEntity<?> save(@RequestBody Employee employee) {
      long id = employeeService.save(employee);
      return ResponseEntity.ok().body("New Employee has been saved with ID:" + id);
   }

   /*---Get a employee by id---*/
   @RequestMapping(value="/employee/{id}" ,headers = "Accept=application/json")
   @GetMapping("/employee/{id}")
   public ResponseEntity<Employee> get(@PathVariable("id") long id)  {
	   Employee employee = employeeService.get(id);	   
      return ResponseEntity.ok().body(employee);
   }

   /*---get all employees---*/
   @GetMapping("/employee")
   public ResponseEntity<List<Employee>> list() {
      List<Employee> employees = employeeService.list();
      return ResponseEntity.ok().body(employees);
   }

   /*---Update a employee by id---*/
   @PutMapping("/employee/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Employee employee) {
      employeeService.update(id, employee);
      return ResponseEntity.ok().body("Employee has been updated successfully.");
   }

   /*---Delete a employee by id---*/
   @DeleteMapping("/employee/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      employeeService.delete(id);
      return ResponseEntity.ok().body("Employee has been deleted successfully.");
   }
}
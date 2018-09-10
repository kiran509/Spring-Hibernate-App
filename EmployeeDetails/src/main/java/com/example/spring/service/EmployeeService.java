package com.example.spring.service;

import java.util.List;

import com.example.spring.model.Employee;

public interface EmployeeService {

   long save(Employee employee);
   Employee get(long id);
   List<Employee> list();
   void update(long id, Employee employee);
   void delete(long id);
}

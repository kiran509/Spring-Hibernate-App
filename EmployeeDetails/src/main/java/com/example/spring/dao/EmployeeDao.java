package com.example.spring.dao;

import java.util.List;

import com.example.spring.model.Employee;

public interface EmployeeDao {

   long save(Employee employee);

   Employee get(long id);

   List<Employee> list();

   void update(long id, Employee employee);

   void delete(long id);

}

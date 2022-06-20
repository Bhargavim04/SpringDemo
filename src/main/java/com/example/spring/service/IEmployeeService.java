package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Address;
import com.example.spring.entity.Employee;
import com.example.spring.entity.Skill;
import com.example.spring.exception.EmployeeNotFoundException;

public interface IEmployeeService {

	List<Employee> getAllEmployees();
	Employee getEmpById(int empId) throws EmployeeNotFoundException;
	Employee addEmployee(Employee emp);
	Employee updateEmployeeById(int empId, Employee emp);
	Employee deleteEmployee(int empId);
	Employee updateEmployeeName(int empId, String newName);
	Employee updateEmpAddr(int empId, Address newAddr);
	Employee updateEmpSkill(int empId, Skill skill);

}

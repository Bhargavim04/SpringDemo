package com.example.spring.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import com.example.spring.entity.Employee;

@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	IEmployeeService empServ;

	// update emp name
	@Test
	void testUpdateEmp() {
		Employee emp = empServ.updateEmployeeName(8, "Priya");
		assertEquals("Priya", emp.getEmpName());
	}
}

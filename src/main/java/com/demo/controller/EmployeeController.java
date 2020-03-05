package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Employee;
import com.demo.services.EmployeeService;

/**
 * @author Mehul
**/

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	/*
	 * @RequestMapping(value = "/user/getEmployeesList", produces =
	 * "application/json") public List<Employee> getEmployeesList(@RequestBody
	 * Employee employee) {
	 * 
	 * List<Employee> empList =
	 * employeeService.getEmployeeByName(employee.getEmpName()); //List<Employee>
	 * empList = employeeService.getEmployeeByEmailId(employee.getEmailId()); return
	 * empList; }
	 */
    @RequestMapping(value = "/user/getEmployeesList", produces = "application/json")
    @ResponseBody
    public List<Employee> getEmployeesList() {
        List<Employee> employees = new ArrayList<>();
        Employee emp = new Employee();
        //emp.setEmpId("emp1");
        emp.setEmpName("emp1");
        emp.setEmailId("emp1@ksjdfh.com");
        employees.add(emp);
        return employees;

    }
}

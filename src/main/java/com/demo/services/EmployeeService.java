/**
 * 
 */
package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

/**
 * @author Mehul
**/

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getEmployeeByEmailId(String emailId) {
		return employeeDao.getEmployeeByEmailId(emailId);
	}

	/**
	 * @param empName
	 * @return
	 */
	public List<Employee> getEmployeeByName(String empName) {
		return employeeDao.findAllByEmpName(empName);
	}
}

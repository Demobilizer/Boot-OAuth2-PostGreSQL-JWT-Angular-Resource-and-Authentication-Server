/**
 * 
 */
package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Employee;

/**
 * @author Mehul
**/

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	/**
	 * @param emailId
	 * @return
	 */
	List<Employee> getEmployeeByEmailId(String emailId);

	/**
	 * @param empName
	 * @return 
	 */
	List<Employee> findAllByEmpName(String empName);

	
}

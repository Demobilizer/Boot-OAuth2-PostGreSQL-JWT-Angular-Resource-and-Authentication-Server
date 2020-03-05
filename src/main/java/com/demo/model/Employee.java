/**
 * 
 */
package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Mehul
 */

@Entity
@Table(name = "employee")
@Data
public class Employee {

	@Id
	@GeneratedValue
	@Setter
	@Getter
	private int empId;
	
	@Setter
	@Getter
	private String empName;
	
	@Setter
	@Getter
	private String emailId;
	
}

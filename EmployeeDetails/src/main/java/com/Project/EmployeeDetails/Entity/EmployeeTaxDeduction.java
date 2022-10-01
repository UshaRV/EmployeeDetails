package com.Project.EmployeeDetails.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmployeeTaxDeduction {
	
    @Id
	private long employeeCode;
	
	private String firstName;

	 
	private String lastName;
	
	private double yearlySalary;
	
	private  double taxAmount;
	
	private  double cessAmount;
	
	
	
	
	 
	
	
}

package com.Project.EmployeeDetails.Dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class EmployeeTaxDto {
	
 
	 
 
	private long employeeId;

    @NotNull
	private String firstName;

    @NotNull
	private String lastName;
    
    
    @NotNull
   	private double salary;

}

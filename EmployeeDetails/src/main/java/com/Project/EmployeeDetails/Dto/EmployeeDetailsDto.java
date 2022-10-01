package com.Project.EmployeeDetails.Dto;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

 
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class EmployeeDetailsDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;

	@Column(name="first_name")
	@NotNull
	private String firstName;

	@Column(name="last_name")
	@NotNull
	private String lastName;
	
	 

	@NotNull
	@Size(min = 8,message = "Please enter EmailId")
	@Email
	private String email;

	@NotNull
    @Size(min = 12, message = "Please enter valid phone number")
	private String phoneNo;

	
	@NotNull
	private String doj;

	@NotNull
	private double salary;

}

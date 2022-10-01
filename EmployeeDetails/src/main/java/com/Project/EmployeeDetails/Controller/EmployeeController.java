package com.Project.EmployeeDetails.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.EmployeeDetails.Dto.EmployeeDetailsDto;
import com.Project.EmployeeDetails.Service.EmployeeService;

 

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	
	 //To Store Employe/e Details
		@PostMapping("/addEmployee")
		public ResponseEntity addEmployee(@RequestBody @Valid  EmployeeDetailsDto empDto) {

			

			employeeService.addEmployee(empDto);
		  return new ResponseEntity("Added Employee Details Successfully", HttpStatus.OK);

		}

}

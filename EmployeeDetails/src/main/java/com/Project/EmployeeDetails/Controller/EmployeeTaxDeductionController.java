package com.Project.EmployeeDetails.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.EmployeeDetails.Dto.EmployeeDetailsDto;
import com.Project.EmployeeDetails.Dto.EmployeeTaxDto;
import com.Project.EmployeeDetails.Entity.EmployeeDetails;
import com.Project.EmployeeDetails.Entity.EmployeeTaxDeduction;
import com.Project.EmployeeDetails.Service.EmployeeTaxDeductionService;

@RestController
@RequestMapping("/api")
public class EmployeeTaxDeductionController {
	
	@Autowired
	private EmployeeTaxDeductionService employeeTaxDeductionService;
	
	
	
	
		@PostMapping("/returnTaxDeduction")
		public  EmployeeTaxDeduction addEmployeeDetails(@RequestBody  @Valid EmployeeTaxDto employeeTaxDto) {
			return  employeeTaxDeductionService.addEmployeeInfo(employeeTaxDto);

		}
	

}

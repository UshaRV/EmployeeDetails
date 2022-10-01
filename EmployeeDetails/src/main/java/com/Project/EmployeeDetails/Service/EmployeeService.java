package com.Project.EmployeeDetails.Service;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Service;
 
import com.Project.EmployeeDetails.Dao.EmployeeRepository;
import com.Project.EmployeeDetails.Dto.EmployeeDetailsDto;
import com.Project.EmployeeDetails.Entity.EmployeeDetails;
import com.Project.EmployeeDetails.Exception.RegistrationCustomException;
import com.Project.EmployeeDetails.Exception.ResourceAlreadyExistsException;

@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepository employeerepository;
	

	
	//To store Employee Details
	public void addEmployee(EmployeeDetailsDto employeeDetailsDto) {
		 
		 

			EmployeeDetails employeeDetails = new EmployeeDetails();
			 

			ModelMapper modelmapper = new ModelMapper();
			if (employeeDetailsDto == null) {
				throw new RuntimeException("Please enter all the required details");
			} else if (employeerepository.existsByEmail(employeeDetailsDto.getEmail())) {
				throw new RegistrationCustomException("502", "Employee with this email is Already Exists please enter different One");
			}else if (employeerepository.existsByPhoneNo(employeeDetailsDto.getPhoneNo())) {
	            
	            throw new ResourceAlreadyExistsException("Phone number already exists please register with different phone number");
	        } else

			{
	        	
	        	
				modelmapper.map(employeeDetailsDto, employeeDetails);
				
				     employeerepository.save(employeeDetails);
				 

				 
	 
			}

		}
		 

	
		
	}

	
	


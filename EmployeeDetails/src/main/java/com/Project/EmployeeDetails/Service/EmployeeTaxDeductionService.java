package com.Project.EmployeeDetails.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.EmployeeDetails.Dao.EmployeeTaxDeductionRepository;
import com.Project.EmployeeDetails.Dto.EmployeeDetailsDto;
import com.Project.EmployeeDetails.Dto.EmployeeTaxDto;
import com.Project.EmployeeDetails.Entity.EmployeeDetails;
import com.Project.EmployeeDetails.Entity.EmployeeTaxDeduction;

@Service
public class EmployeeTaxDeductionService {
	
	
	@Autowired
    private EmployeeTaxDeductionRepository emptaxrepo;
	
	

	public EmployeeTaxDeduction addEmployeeInfo(EmployeeTaxDto employeeTaxDto) {
		 
		EmployeeTaxDeduction emptaxdeduction = new EmployeeTaxDeduction();
		
		emptaxdeduction.setFirstName(employeeTaxDto.getFirstName());
		emptaxdeduction.setLastName(employeeTaxDto.getLastName());
		emptaxdeduction.setEmployeeCode(employeeTaxDto.getEmployeeId());
		emptaxdeduction.setYearlySalary(employeeTaxDto.getSalary()*12);
		
		                        
		
		if(emptaxdeduction.getYearlySalary()  <  250000) {
			
			emptaxdeduction.setTaxAmount(0);
			}
		
		else if (emptaxdeduction.getYearlySalary() >250000 &&  emptaxdeduction.getYearlySalary()<=500000) {
			
			double tax =5%(emptaxdeduction.getYearlySalary());
			emptaxdeduction.setTaxAmount(tax);
			}
		else if(emptaxdeduction.getYearlySalary() >500000 &&  emptaxdeduction.getYearlySalary()<=1000000) {
			
			double tax =10%(emptaxdeduction.getYearlySalary());
			emptaxdeduction.setTaxAmount(tax);
			}
		else if(emptaxdeduction.getYearlySalary() > 1000000) {
				
				double tax =20%(emptaxdeduction.getYearlySalary());
				emptaxdeduction.setTaxAmount(tax);
		        } 
		if(emptaxdeduction.getYearlySalary() >= 2500000) {
			

			double cess =2%(emptaxdeduction.getYearlySalary());
			emptaxdeduction.setCessAmount(cess);
			
		}
			
		emptaxrepo.save(emptaxdeduction);
		
		
		return emptaxdeduction ;
	}

}

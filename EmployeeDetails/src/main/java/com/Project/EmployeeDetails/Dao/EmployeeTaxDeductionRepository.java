package com.Project.EmployeeDetails.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.EmployeeDetails.Entity.EmployeeDetails;
import com.Project.EmployeeDetails.Entity.EmployeeTaxDeduction;

public interface EmployeeTaxDeductionRepository extends JpaRepository<EmployeeTaxDeduction, Long> {

}

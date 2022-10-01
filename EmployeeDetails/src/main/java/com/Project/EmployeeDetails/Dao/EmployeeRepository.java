package com.Project.EmployeeDetails.Dao;

import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.EmployeeDetails.Entity.EmployeeDetails;

 

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {

	boolean existsByPhoneNo(@NotNull String phoneNo);

	boolean existsByEmail(@NotNull String email);

}

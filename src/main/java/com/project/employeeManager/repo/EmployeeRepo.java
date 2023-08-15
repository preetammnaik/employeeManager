package com.project.employeeManager.repo;

import com.project.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Optional<Employee> findEmployeeByid(Long id);
}

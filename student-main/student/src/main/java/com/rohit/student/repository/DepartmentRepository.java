package com.rohit.student.repository;

import com.rohit.student.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    List<Department> findByDepartmentId(int departmentId);
    List<Department> findByDepartmentName(String departmentName);
    List<Department> findByDepartmentStrength(int departmentStrength );

}





package com.rohit.student.repository;

import com.rohit.student.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
    List<Faculty> findByFacultyId(int facultyId);
    List<Faculty> findByFirstName(String firstName);
    List<Faculty> findByLastName(String lastName );
    List<Faculty> findByAge(int age );
    List<Faculty> findBySubjectHandling(String subjectHandling );
    List<Faculty> findByBasicPay(float basicPay );
    List<Faculty> findByStartDate(Date startDate );
    List<Faculty> findByDepartmentId(int departmentId );


}


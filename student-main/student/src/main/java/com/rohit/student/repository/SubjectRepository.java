package com.rohit.student.repository;
import com.rohit.student.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    List<Subject> findBySubjectId(int subjectId);
    List<Subject> findBySubjectName(String subjectName);
    List<Subject> findByHandlingStaff(int handlingStaff );
}

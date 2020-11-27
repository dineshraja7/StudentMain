package com.rohit.student.repository;

import com.rohit.student.model.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentSubjectRepository extends JpaRepository<StudentSubject, Integer> {
    List<StudentSubject> findBySubjectId(int subjectId);

    List<StudentSubject> findByStudentId(int studentId);



    @Query(value = "Select ss.stu_sub_id,sb.subject_name  from stu_subject  ss inner join student  st on st.student_id = ss.student_id inner join subject  sb on ss.subject_id = sb.subject_id",nativeQuery = true)
    List<StudentSubject>findAllDetails();



}
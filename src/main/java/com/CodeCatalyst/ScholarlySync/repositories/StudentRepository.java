package com.CodeCatalyst.ScholarlySync.repositories;

import com.CodeCatalyst.ScholarlySync.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByUserId(Long userId);
    List<Student> findAll();
    Student updateStudentByUserId(Long userId, Student student);
    void deleteStudentByUserId(Long userId);
    <S extends Student> S save(S student);
}

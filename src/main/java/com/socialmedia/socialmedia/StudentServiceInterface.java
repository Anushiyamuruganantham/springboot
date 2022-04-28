package com.socialmedia.socialmedia;

import java.util.List;
import java.util.Optional;

public interface StudentServiceInterface {
    Student addStudent(Student student);
    void deleteStudent(Integer student_id);
    List<Student> getStudents();
    Optional<Student> getStudent(Integer student_id);
    Student updateStudent(Student student, Integer student_id);
}


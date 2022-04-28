package com.socialmedia.socialmedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentServiceInterface {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
      return  studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer student_id) {
        studentRepository.deleteById(student_id);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Optional<Student> getStudent(Integer student_id){
        return studentRepository.findById(student_id);
    }
    @Override
    public Student updateStudent(Student student, Integer student_id){
        student.setId(student_id);
        return studentRepository.save(student);
    }


    }


   /* public void addStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Integer student_id){
        return studentRepository.findById(student_id);
    }

    public Student updateStudent(Student student, Integer student_id){
        student.setId(student_id);
        return studentRepository.save(student);
    }
    public void deleteStudent(Integer student_id){
        studentRepository.deleteById(student_id);
    }

    */





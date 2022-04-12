package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class Studentservice {
    List<Student> students = new ArrayList<Student>();
    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> getStudents(){
        return students;
    }
    public Student getStudent(String student_id) {
        Student resp = null;
        for (Student student : students) {
            if (student.getId().equals(student_id)) {
                resp = student;
                break;
            }
        }
        return resp;
    }
    public Student updateStudent(Student student, String student_id){
        Student response = null;
        for (Student student_obj:students) {
            if (student_obj.getId().equals(student_id)){
                student_obj.setName(student.getName());
                student_obj.setStandard(student.getStandard());
                response = student_obj;
                break;
            }
        }
        return response;
    }
    public void deleteStudent(String student_id){
        List<Student> new_students_list = new ArrayList<Student>();
        for (Student student: students) {
            if(!student.getId().equals(student_id)){
                new_students_list.add(student);
            }
        }
        students = new_students_list;
    }

}

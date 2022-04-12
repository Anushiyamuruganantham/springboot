package com.socialmedia.socialmedia;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.*;

@RestController
public class Studentapi {
    List<Student> students = new ArrayList<Student>();
    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/student")
    public List<Student> getStudents(){
        return students;
    }
    @RequestMapping(method = RequestMethod.GET, value = "/student/{student_id}")
    public Student getStudent(@PathVariable("student_id") String student_id) {
        Student resp = null;
        for (Student student : students) {
            if (student.getId().equals(student_id)) {
                resp = student;
                break;
            }
        }
        return resp;
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/student/{student_id}" )
    public Student updateStudent(@RequestBody Student student, @PathVariable("student_id") String student_id) {
        Student response = null;
        for (Student student_obj : students) {
            if (student_obj.getId().equals(student_id)) {
                student_obj.setName(student.getName());
                student_obj.setStandard(student.getStandard());
                response=student_obj;
                break;
            }
        }

return response;}

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{student_id}")
    public void deleteStudent(@PathVariable("student_id") String student_id){
        List<Student> new_students_list = new ArrayList<Student>();
        for (Student student: students) {
            if(!student.getId().equals(student_id)){
                new_students_list.add(student);
            }
        }
        students = new_students_list;
    }

    }


package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.*;

@RestController
public class Studentapi {
    @Autowired
            private Studentservice studentService;
    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/student")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/student/{student_id}")
    public Student getStudent(@PathVariable("student_id") String student_id){
        return studentService.getStudent(student_id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/student/{student_id}" )
    public Student updateStudent(@RequestBody Student student, @PathVariable("student_id") String student_id) {
            return studentService.updateStudent(student, student_id);
        }
    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{student_id}")
    public void deleteStudent(@PathVariable("student_id") String student_id){
        studentService.deleteStudent(student_id);
    }

    }


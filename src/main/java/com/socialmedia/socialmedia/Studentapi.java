package com.socialmedia.socialmedia;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class Studentapi {
   @Autowired
   private ModelMapper modelMapper;
    @Autowired
            private StudentService studentService;

    @RequestMapping(method = RequestMethod.POST, value = "/student")
   public StudentDto addStudent(@RequestBody StudentDto studentDto) {
        Student student1=modelMapper.map(studentDto,Student.class);
        student1=studentService.addStudent(student1);
     return  modelMapper.map(student1,StudentDto.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/student")
    public List<StudentDto> getStudents(){
        return studentService.getStudents().stream().map(student -> modelMapper.map(student,StudentDto.class)).collect(Collectors.toList());
    }
    @RequestMapping(method = RequestMethod.GET, value = "/student/{student_id}")
    public Optional<StudentDto> getStudent(@PathVariable("student_id") Integer student_id){
        Optional<Student>student=studentService.getStudent(student_id);
       Optional<StudentDto> studentDto=modelMapper.map(student,Optional.class);
        return studentDto;
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/student/{student_id}" )
    public StudentDto updateStudent(@RequestBody StudentDto studentDto, @PathVariable("student_id") Integer student_id) {
           Student student=modelMapper.map(studentDto,Student.class);
           student=studentService.updateStudent(student,student_id);
           StudentDto studentdetails=modelMapper.map(studentDto,StudentDto.class);
            return studentdetails;
        }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{student_id}")
    public void deleteStudent(@PathVariable("student_id") int student_id){
        studentService.deleteStudent(student_id);
    }

    }


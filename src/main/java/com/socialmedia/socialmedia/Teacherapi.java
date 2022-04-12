package com.socialmedia.socialmedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.*;
@RestController
public class Teacherapi {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(method = RequestMethod.POST, value = "/teacher")
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/teacher")
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/teacher/{teacher_id}")
    public Teacher getTeacher(@PathVariable("teacher_id") String teacher_id) {
        return teacherService.getTeacher(teacher_id);

   }
    @RequestMapping(method = RequestMethod.PUT, value = "/teacher/{teacher_id}" )
    public Teacher updateStudent(@RequestBody Teacher teacher, @PathVariable("teacher_id") String teacher_id){
        return teacherService.updateStudent(teacher, teacher_id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/teacher/{teacher_id}")
    public void deleteTeacher(@PathVariable("teacher_id") String teacher_id){
        teacherService.deleteTeacher(teacher_id);
    }

}
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

   @PostMapping("/teacher")
    public void addTeacher(@RequestBody Teacher teacher){
       teacherService.addTeacher(teacher);
   }
   @GetMapping("/teacher")
    public List<Teacher>getTeacher(){
       return teacherService.getTeachers();
   }
   @GetMapping("/teacher/{teacher_id}")
    public Optional<Teacher>getTeacher(@PathVariable("teacher_id")Integer teacher_id){
       return teacherService.getTeacher(teacher_id);
   }
   @PutMapping("/teacher/{teacher_id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable("teacher_id")Integer teacher_id)
   {return teacherService.updateTeacher(teacher,teacher_id);}
@DeleteMapping("/teacher/{teacher_id}")
    public void deleteTeacher(@PathVariable("teacher_id")Integer teacher_id){
       teacherService.deleteTeacher(teacher_id);
}
}
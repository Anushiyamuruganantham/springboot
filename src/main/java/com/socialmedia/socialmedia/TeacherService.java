package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.*;

@Service
public class TeacherService {
    @Autowired
            private TeacherRepository teacherRepository;
    public void addTeacher( Teacher teacher) {
        teacherRepository.save(teacher) ;
    }
    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacher(Integer teacher_id) {
        return teacherRepository.findById(teacher_id);
    }
    public Teacher updateTeacher( Teacher teacher, Integer teacher_id) {
        teacher.setId(teacher_id);
        return teacherRepository.save(teacher);
        }

    public void deleteTeacher(Integer teacher_id){
        teacherRepository.deleteById(teacher_id);
    }

}

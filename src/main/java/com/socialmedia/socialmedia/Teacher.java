package com.socialmedia.socialmedia;

import javax.persistence.Entity;
import javax.persistence.*;
@Entity
@Table(name="anushiya_teacher")

public class Teacher {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String subjectmajor;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectmajor() {
        return subjectmajor;
    }

    public void setSubjectmajor(String subjectmajor) {
        this.subjectmajor = subjectmajor;
    }

    public Teacher(){}
    public Teacher(int id, String name, String subjectmajor) {
        this.id = id;
        this.name = name;
        this.subjectmajor = subjectmajor;
    }

}

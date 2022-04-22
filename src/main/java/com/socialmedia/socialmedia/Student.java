package com.socialmedia.socialmedia;
import javax.persistence.*;
@Entity
@Table(name="anush_student")
public class Student {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;


//public class Student {
  //  private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String standard;
   public Student(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Student(int id, String name, String standard) {
        this.id = id;
        this.name = name;
        this.standard = standard;
    }
}

package com.socialmedia.socialmedia;

public class Teacher {
    private String id;
    private String name;
    private String subjectmajor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    public Teacher(String id, String name, String subjectmajor) {
        this.id = id;
        this.name = name;
        this.subjectmajor = subjectmajor;
    }

}

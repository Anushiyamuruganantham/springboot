package com.socialmedia.socialmedia;

public class Personalinfo {
    private String name;
    private String designation;
    Personalinfo(){}

    public Personalinfo(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }



}

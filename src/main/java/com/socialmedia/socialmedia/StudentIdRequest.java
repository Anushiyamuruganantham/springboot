package com.socialmedia.socialmedia;

public class StudentIdRequest {
    private String[] ids;

    public StudentIdRequest(){}

    public StudentIdRequest(String[] ids){
        this.ids=ids;
    }
    public String[] getIds() {
        return ids;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }
}

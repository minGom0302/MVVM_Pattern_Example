package com.example.mvvm_example;

public class User {
    String name;
    String memberNum;

    public User(String name, String memberNum) {
        this.name = name;
        this.memberNum = memberNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum;
    }
}

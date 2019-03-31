package com.ttn.restApiSpring.version;

public class StudentV1 {
    public StudentV1(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

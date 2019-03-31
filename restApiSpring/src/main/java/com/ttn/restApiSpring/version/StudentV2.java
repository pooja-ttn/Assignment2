package com.ttn.restApiSpring.version;

public class StudentV2 {
private Name firstName;

    public StudentV2(Name firstName) {
        this.firstName = firstName;
    }

    public Name getFirstName() {
        return firstName;
    }

    public void setFirstName(Name firstName) {
        this.firstName = firstName;
    }
}

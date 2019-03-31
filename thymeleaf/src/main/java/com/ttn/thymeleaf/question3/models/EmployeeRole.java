package com.ttn.thymeleaf.question3.models;

import java.util.Arrays;
import java.util.List;

public enum EmployeeRole {


// Ques 9: Create an ENUM with values USER, ADMIN, SUPER_ADMIN and iterate it to show a custom message to users basis on the ENUM value

        USER("User: Read, Write"), ADMIN("Admin: Create, Read, Write"), SUPER_ADMIN("Super Admin: Create, Read, Write, Delete");

        String message;

        EmployeeRole(String message){
            this.message = message;
        }

        public String getMessage(){
            return this.message;
        }

        public static List<EmployeeRole> getRoles(){
            return Arrays.asList(USER, ADMIN, SUPER_ADMIN);
        }
    }


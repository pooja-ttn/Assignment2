package com.ttn.thymeleaf.question3.models;

public class Employee {
        private String name;
        private String email;
        private int age;
        private String gender;
        private boolean admin;
        private EmployeeRole role;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public boolean isAdmin() {
            return admin;
        }

        public void setAdmin(boolean admin) {
            this.admin = admin;
        }

        public EmployeeRole getRole() {
            return role;
        }

        public void setRole(EmployeeRole role) {
            this.role = role;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", admin=" + admin +
                    ", role=" + role +
                    '}';
        }
    }


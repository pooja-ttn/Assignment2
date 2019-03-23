package com.ttn.springboot.question3;

/*Question 3-
Create Bean User containing two field username and password with Spring Context File (1 Mark)
*/

public class User {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("User Name- "+this.username);
        System.out.println("Password - "+this.password);

    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

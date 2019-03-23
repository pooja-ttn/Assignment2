package com.ttn.springboot.question4_5_6;


import org.springframework.beans.factory.annotation.Value;

/*
Question 4-

Create a Bean Database with two fields port and name and Access its values using

application.properties (1 Mark)

*/


/*Question 5-

Configure environment specfic values for Database Bean (2 Marks)

*/

/*Question 6-

Apply Logging whereever you feel is necessity (1 Mark)

//Uncomment the log in application.properties

*/
public class Database {
    @Value("${database.port}")
    int port;
    @Value("${database.name}")
    String name;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

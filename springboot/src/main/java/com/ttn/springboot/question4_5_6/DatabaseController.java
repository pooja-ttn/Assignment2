package com.ttn.springboot.question4_5_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
@Autowired
Database database;
Logger logger= LoggerFactory.getLogger(DatabaseController.class);
    @RequestMapping("/database")
    public String showDatabase(){
        System.out.println("Database name = "+database.name);
        System.out.println("Database port = "+database.port);
        return "DataBase- "+database.name+" "+"Database Port- "+database.port;
    }

    @RequestMapping("/logging")
    public String index(){
        logger.trace("This is the trace message");
        logger.info("This is the info message");
        logger.debug("This is the debug message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Log printed on console.....";
    }
}

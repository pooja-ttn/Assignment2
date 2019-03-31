package com.ttn.thymeleaf.question3.controllers;


import com.ttn.thymeleaf.question3.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomePageController {

    List<Employee> employeeList = new ArrayList<>();

    @RequestMapping
    public ModelAndView homepage(){
        ModelAndView modelAndView = new ModelAndView("homepage");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }

    //  Ques 3:   Create an Employee registration form and bind it's requested values on the controller.
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public ModelAndView register(Employee employee){
        employeeList.add(employee);
        System.out.println("Employee List: " + employeeList);
        return showEmployees();
    }

    //  Ques 4: Create a dynamic HTML page and render an Employee table with emp object return from the controller
    @RequestMapping("show")
    public ModelAndView showEmployees(){
        ModelAndView modelAndView = new ModelAndView("showEmployees");
        modelAndView.addObject("listOfEmployees", employeeList);
        return modelAndView;
    }

    //  Ques 7: Make a web page to show server time using ajax call.

    @RequestMapping("updateTime")
    @ResponseBody
    public String updateTime(){
        return Calendar.getInstance().getTime().toString();
    }

    //    Ques 10: Add loader in registration form submission which renders load till server return success form submission response
    @RequestMapping("login")
    public ModelAndView login(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ModelAndView("login");
    }
}
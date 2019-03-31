package com.ttn.thymeleaf.question1_2.controllers;
import com.ttn.thymeleaf.question1_2.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
/*Question 1-
Create an external JS file and use it to show an alert on click of a button.
*/
/*Question 2-
Create an external CSS file and use it to modify hello world page background color to grey.
*/

@Controller
public class userController {

    @RequestMapping("/Hello")
    String sayHi(@ModelAttribute("user") User user){
        return "hello.html";
    }

}

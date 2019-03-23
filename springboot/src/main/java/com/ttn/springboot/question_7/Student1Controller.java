package com.ttn.springboot.question_7;
import com.ttn.springboot.question_7.entity.Student1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.List;

@Controller
public class Student1Controller {

@Autowired
    Student1Service studentService;

    @RequestMapping("/showDatabase")
    String show(Model model){
        model.addAttribute("output",studentService.getBooks());

        return "question7.html";
    }
}

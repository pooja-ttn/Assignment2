package Controller.question3;


/*Question 3-
 * Use annotation in StudentController to define a default action index which renders a jsp page.*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class StudentsController {

    @RequestMapping("/test2")
    public ModelAndView index1 (){
        ModelAndView modelAndView =new ModelAndView("hello1");
        return modelAndView;
    }

}

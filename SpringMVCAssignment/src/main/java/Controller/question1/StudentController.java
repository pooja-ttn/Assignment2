package Controller.question1;


/*Question 1-
  Implement AbstractController in StudentController. create a mapping index.html for it
   and render index.jsp view from it which displays messages "Hello from index.jsp"
  */

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;
    }
}



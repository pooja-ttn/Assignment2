package Controller.question2;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*  Question 2- Now remove AbstractController and use MultiActionController for
     StudentController which contains 2 actions one action renders a jsp view and
     another action uses HttpServletResponse to show the output on the Web browser.*/

public class StudentController extends MultiActionController {

    public ModelAndView dummy (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }

    public void dummy2(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("\nThis is the second action of MultiActionController");

    }
}



class Test extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("Question2");
    }
}
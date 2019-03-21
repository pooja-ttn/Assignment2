package Controller.question_4_to_10;

import Controller.question_4_to_10.StudentCO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/*Question 4 -
Create one more annotation based action hello inside the StudentController4
which and use @ResponseBody annotation from it to display Hello world.


Question 5-
Create one more action which sends Model HelloWorld to the jsp file.
*/
@Controller
@ControllerAdvice
class StudentController4 {

    //Question 4
    @RequestMapping("/method2")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }


//    Question 5
    @RequestMapping("/method3")
    ModelAndView helloWorld() {
        ModelAndView modelAndView = new ModelAndView("new1");
        modelAndView.addObject("message", "Hello World");
        return modelAndView;
    }



    /*Question 6-
Use @PathVariable annotation to access firstname and lastname in an action
inside StudentController3 place both the parameters in different arguments and access them.
* */
        @RequestMapping("/method4/{firstname}/{lastname}")
        ModelAndView path(@PathVariable("firstname") String fname,@PathVariable("lastname") String lname ){
            ModelAndView modelAndView=new ModelAndView("name");
            modelAndView.addObject("firstname",fname);
            modelAndView.addObject("lastname",lname);
            return modelAndView;

        }

        /*Question 7-

Now place both the arguments inside a Map and access the Map instead.
(Hint : check the slide for @PathVariable action returnCountryAndState  shows how to do it with map)

   */
        @RequestMapping("/method5/{firstname}/{lastname}")
        ModelAndView pathWithMap(@PathVariable Map<String,String> map){
            ModelAndView modelAndView=new ModelAndView("name");
            modelAndView.addObject("firstname",map.get("firstname"));
            modelAndView.addObject("lastname",map.get("lastname"));
            return modelAndView;

        }
        /*Question 8-

       Use @RequestParam annotation to access the firstname and lastname in formData action of StudentController.*/
      @RequestMapping("/method6")
        ModelAndView formData(@RequestParam("firstname")String fname,@RequestParam("lastname") String lname)
      {
          ModelAndView modelAndView =new ModelAndView("name");
          modelAndView.addObject("firstname",fname);
          modelAndView.addObject("lastname",lname);
          return modelAndView;
      }



/*Question 9-
Create a StudentCO and bind firstname and lastname with instance variable of StudentCO.*/


@RequestMapping("/test1")
ModelAndView test1()
{
    ModelAndView modelAndView=new ModelAndView("Question9_10");
    return modelAndView;
}

@RequestMapping("/method7")
@ResponseBody
String studentCOForm(StudentCO studentCO) {
    return "Firstname \n  -" + studentCO.getFirstname()  + "  Lastname \n  -" + studentCO.getLastname();

}

/*Question 10)
Use @ModelAttribute annotation to add Heading "Spring MVC Demo" in every model.
*/
@ModelAttribute
    void addHeading(Model model){
    model.addAttribute("heading","Spring MVC Demo");
}


}
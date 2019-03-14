package Question_8_9;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/* Q8) Demonstrate the use of pointCut @Pointcut annotation and Reuse the expression created*/

/*Q9)
  Access the properties of the JoinPoint in before advice. Print Signature of method being called and its arguments
*/


public class MainClass {
        public static void main(String[] args) {
            ConfigurableApplicationContext cxt=new ClassPathXmlApplicationContext("SpringConfig.xml");
            Services services=cxt.getBean(Question_8_9.Services.class);
            System.out.println("-------------Question 8-----------");
            services.start();
            services.setString("Pooja Joshi");
            services.stop();

            System.out.println("\n-------------Question 9--------------");
            services.accessing("Pooja");


        }
    }




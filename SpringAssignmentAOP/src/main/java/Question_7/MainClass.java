package Question_7;

/*Q 7)  Apply execution, within, args, this and bean expressions on the before and after advice of service bean.*/

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {

        public static void main(String[] args) {
            ConfigurableApplicationContext cxt=new ClassPathXmlApplicationContext("SpringConfig.xml");
            Services services=cxt.getBean(Question_7.Services.class);

            services.start();
            System.out.println("\n");
            services.setInteger(10);
            System.out.println("\n");
            services.stop();
        }
    }



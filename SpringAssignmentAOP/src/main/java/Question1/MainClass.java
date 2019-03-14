package Question1;


/* Q1) Invoke context events start(), stop() and close().*/
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass{
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("SpringConfig.xml");
    Dummy dummy= configurableApplicationContext.getBean(Dummy.class);
        System.out.println("Start..............");

        configurableApplicationContext.start();
    dummy.display();
        System.out.println("Stop..............");

        configurableApplicationContext.stop();
        System.out.println("Close..............");

        configurableApplicationContext.close();

    }
}
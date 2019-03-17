package Question_11_12;

/*
Question 11)
Use @Transactional to save 2 records using jdbc template with the following prapogation options

    REQUIRED
    REQUIRES_NEW
    NESTED
    MANDATORY
    NEVER
    NOT_SUPPORTED
    SUPPORTS
*/
/*
* Question 12)
* Demonstrate the use of following options of @Transactional annotation

    read-only
    timeout
    rollback-for
    no-rollback-for
*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:SpringConfig_10.xml");
        Question_11_12.SignUp signUp = applicationContext.getBean(SignUp.class);
        Question_11_12.UserTable user=applicationContext.getBean(Question_11_12.UserTable.class);

        user.setUsername("Ayaan");
        user.setPassword("Ayaan123");
        user.setName("Ayaan");
        user.setAge(23);
        user.setDate(null);
        signUp.signUp(user);
    }
}
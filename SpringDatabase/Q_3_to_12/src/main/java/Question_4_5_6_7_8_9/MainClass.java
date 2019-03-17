package Question_4_5_6_7_8_9;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Question 4-
Use JdbcTemplate to get the count of users
*/

/*
 Question 5-
 Get name of the user by providing username to the parametrized query
*/

/*Question 6-
* Insert one record using JdbcTemplate
**/

/*Question 7-
 Use QueryForMap to fetch the user details of the  user
 */

/*Question 8-
Use QueryForList to fetch records of all users
*/
/*Question 9-
Use a rowmapper to get the User object when you query for a user
*/

public class MainClass {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig_4.xml");
        Dao dao = applicationContext.getBean("dao4", Dao.class);
        dao.printUserCount();
       System.out.println(dao.getName());
       dao.insertRecord();
        dao.getUserDetail();
        dao.getAllUsersDetail();
        User user2=dao.getUserDetailsUsingMapper();
        System.out.println(user2);
        dao.remove();


    }
}
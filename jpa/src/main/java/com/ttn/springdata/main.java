package com.ttn.springdata;

import com.ttn.springdata.Service.PersonService;

/*Question 2-
Implement CrudRepository for it.
*/

/*Question 3-
 * Perform all the methods inside CrudRepository for Person Class.
 * */

/*Question 4-For class Person find person declare methods in repository
 to find person by firstname, lastname and Id.
 */

/*Question 5-Use the methods declared above to fetch the person.*/

/*Question 6-Use @Query to fetch firstname of the Person whose age is 25.*/

/*Question 7-
Use @Query to fetch firstname and lastname of the Person whose age is 25.
*/

/*Question 8-
Get complete information of the Employee whose age is 25 using @Query.
*/

/*Question 9-
Count Person where name is "Peter" using @Query.*/

/*Question 10-

    • Implement following methods for Person repository:
        ◦ count
        ◦ distinct
        ◦ or
        ◦ and
        ◦ between
        ◦ LessThan
        ◦ GreaterThan
        ◦ Like
        ◦ Not 
        ◦ In 
        ◦ IgnoreCase
*/

/*Question 11-
 * Get the persons greater than age 25 and sort them in descending order according to id by method query.*/

/*Question 12-
Do  the question above using the Sort class. */

/*Question 13-Apply Pagination on Person entities.*/

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        PersonService personService=new PersonService();
        personService.Question2_3();
        personService.Question_4_5();
        personService.Question_6_7_8_9();
        personService.Question_10();
        personService.Question_11();
        personService.Question_12();
        personService.Question_13();

    }
}
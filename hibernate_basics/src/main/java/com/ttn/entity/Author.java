package com.ttn.entity;

/*Question 1-
Create a class Author with instance variables firstName, lastName and age.
  Perform CRUD operation for Author class.
  */


  /*Question 2-

  Use hbm2ddl create to introduce Date of Birth for Author.
  */

/*Question 3-

Use hbm2dll update to insert at least 4 records for Author.

*/

/*Question 4-
Perform hbm2dll create-drop by closing session factory.
*/

/*Question 5-
Rename all the fields using column annotation.
*/


/*Question 6- Mark lastName as @Transient.

*/

/*Question 7-
Use @Temporal for date of birth of Author.
*/


/*Question 8-
Generate Id for Author Using IDENTITY and TABLE starategy.

*/

/*Question 9-
Create a class Address for Author with instance variables streetNumber, location, State.
*/

/*Question 10-
Create instance variable of Address class inside Author class and save it as embedded object.

*/

/*Question 11-
Introduce a List of subjects for author.
*/

/*Question 12-
* Persist 3 subjects for each author.
* */

/*Question 13-
* Create an Entity book with an instance variable bookName.*/

/*Question 14-
* Implement One to One mapping between Author and Book.*/

/*Question 15-

Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional and
without additional table ) and  implement cascade save.
*/

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

//    Question 8
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "author_id")
    public int id;

    @Column(name = "Firstname")
    private String firstName;

    //Question 6
    @Transient
    @Column(name="LastName")
    private  String lastName;

    @Column(name = "Author_age")
    private int age;


    //Question 7
     @Temporal(TemporalType.DATE)
    @Column(name ="date_of_birth")
    private Date dob;


     //Question 10
     @Embedded
    private Address address;

     //Question 11-
     @ElementCollection
     Set<String> subjects=new HashSet();


     @OneToOne
     @JoinColumn(name="book_join_column")
     private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{ " +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

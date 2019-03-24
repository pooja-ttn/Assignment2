package com.ttn.service;


import com.ttn.entity.*;
import com.ttn.repository.AuthorRepository;
import com.ttn.repository.HibernateUtil;
import org.hibernate.Session;

import java.util.*;

public class AuthorService {
    Session session = HibernateUtil.getSession();

    private AuthorRepository authorRepository = new AuthorRepository();

    public void create() {

//        Question 12-Persist 3 subjects for each author.
        Set<String> subjects = new HashSet<>();
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Hindi");


//         Question 14-
        Book book = new Book();
        book.setBookName("The book of Tomorrow");

        Author author = new Author();
        Address address = new Address();
        author.setSubjects(subjects);
        address.setStreetNumber(10);
        address.setLocation("Noida");
        address.setState("UP");
        author.setAddress(address);
        author.setFirstName("Pooja");
        author.setLastName("Joshi");
        author.setAge(21);
        author.setBook(book);
        author.setDob(Calendar.getInstance().getTime());
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();
        authorRepository.create(author);


        Author author1 = new Author();
        author1.setFirstName("Poonam");
        author1.setLastName("Kumari");
        author1.setAge(45);
        author1.setSubjects(subjects);
        author1.setDob(new Date());
        Address address1 = new Address();
        address1.setStreetNumber(13);
        address1.setLocation("Delhi");
        address1.setState("NeW Delhi");
        author1.setAddress(address1);
        Book book1 = new Book();
        book1.setBookName("Two States");
        author1.setBook(book1);
        session.beginTransaction();
        session.save(book1);
        session.getTransaction().commit();
        authorRepository.create(author1);


        Set<String> subjects1 = new HashSet<>();
        subjects1.add("English");
        subjects1.add("Maths 1");
        subjects1.add("Maths 2");
        Author author5 = new Author();
        author5.setFirstName("Pawan");
        author5.setLastName("Kumar");
        author5.setAge(15);
        Address address2 = new Address();
        address2.setStreetNumber(20);
        address2.setLocation("Panji");
        address2.setState("Goa");
        author5.setAddress(address2);
        author5.setSubjects(subjects1);
        Book book3 = new Book();
        book3.setBookName("Famous Five");
        author5.setBook(book3);
        session.beginTransaction();
        session.save(book3);
        session.getTransaction().commit();
        author5.setDob(Calendar.getInstance().getTime());
        authorRepository.create(author5);


        Set<String> subjects2 = new HashSet<>();
        subjects2.add("Physics");
        subjects2.add("Fiction");
        subjects2.add("Mystery");
        Author author6 = new Author();
        author6.setFirstName("Prateek");
        author6.setLastName("singh");
        author6.setAge(10);
        author6.setDob(Calendar.getInstance().getTime());
        Address address4 = new Address();
        address4.setStreetNumber(50);
        address4.setLocation("Punjabi Bagh");
        address4.setState("Punjab");
        author6.setAddress(address4);
        author6.setSubjects(subjects2);
        Book book4 = new Book();
        book4.setBookName("Premchand");
        author6.setBook(book4);
        session.beginTransaction();
        session.save(book4);
        session.getTransaction().commit();
        authorRepository.create(author6);

    }


    public Author read(int id) {
        return authorRepository.read(id);
    }

    public void update(int id) {
        authorRepository.update(id);
    }


    public void delete(int id) {
        authorRepository.delete(id);
    }



    //Question 15
    public void createOneToManyUni() {

        Book book = new Book();
        book.setBookName("The book of Tomorrow");
        Book book1 = new Book();
        book1.setBookName("Five Points Someone");
        Collection<Book> book2 = new HashSet<>();
        book2.add(book);
        book2.add(book1);


        AuthorOneToManyUni author = new AuthorOneToManyUni();
        Address address = new Address();
        address.setStreetNumber(10);
        address.setLocation("Noida");
        address.setState("UP");
        author.setAddress(address);
        author.setFirstName("Pooja");
        author.setLastName("Joshi");
        author.setAge(21);
        author.setBook(book2);
        author.setDob(Calendar.getInstance().getTime());
        session.beginTransaction();

           session.persist(author);
        session.getTransaction().commit();

    }

//Question 15
    public void createOneToManyBi() {

        AuthorOneToManyBi author = new AuthorOneToManyBi();
        Address address = new Address();
        address.setStreetNumber(10);
        address.setLocation("Noida");
        address.setState("UP");
        author.setAddress(address);
        author.setFirstName("Pooja");
        author.setLastName("Joshi");
        author.setAge(21);

        BookManyToOne book = new BookManyToOne();
        book.setBookName("The book of Tomorrow");
        BookManyToOne book1 = new BookManyToOne();
        book1.setBookName("Five Points Someone");
        Collection<BookManyToOne> book2 = new HashSet<>();
        book2.add(book);
        book2.add(book1);
        author.setBook(book2);
        author.setDob(Calendar.getInstance().getTime());
        book.setAuthorOneToManyBi(author);
        book1.setAuthorOneToManyBi(author);
        session.beginTransaction();

        session.persist(author);
        session.getTransaction().commit();

    }

//    Question 15-
    public void createOneToManyWithoutAdditionalTable() {

        AuthorOneToManyWithoutAdditionalTable author = new AuthorOneToManyWithoutAdditionalTable();
        Address address = new Address();
        address.setStreetNumber(10);
        address.setLocation("Noida");
        address.setState("UP");
        author.setAddress(address);
        author.setFirstName("Pooja");
        author.setLastName("Joshi");
        author.setAge(21);

        BookManyToOneWithoutTable book = new BookManyToOneWithoutTable();
        book.setBookName("The book of Tomorrow");
        BookManyToOneWithoutTable book1 = new BookManyToOneWithoutTable();
        book1.setBookName("Five Points Someone");
        Collection<BookManyToOneWithoutTable> book2 = new HashSet<>();
        book2.add(book);
        book2.add(book1);
        author.setBook(book2);
        author.setDob(Calendar.getInstance().getTime());
        book.setAuthorOneToManyWithoutAdditionalTable(author);
        book1.setAuthorOneToManyWithoutAdditionalTable(author);
        session.beginTransaction();
        session.persist(author);
        session.getTransaction().commit();

    }

    /*Question 16-
    Implement Many to Many Mapping between Author and Book.
    */
    public void createManyToMany() {

        AuthorManyToMany author = new AuthorManyToMany();
        Address address = new Address();
        address.setStreetNumber(10);
        address.setLocation("Noida");
        address.setState("UP");
        author.setAddress(address);
        author.setFirstName("Pooja");
        author.setLastName("Joshi");
        author.setAge(21);

        AuthorManyToMany author1 = new AuthorManyToMany();
        Address address1 = new Address();
        address.setStreetNumber(11);
        address.setLocation("Bihar");
        address.setState("Bihar");
        author1.setAddress(address);
        author1.setFirstName("Palak");
        author1.setLastName("Joshi");
        author1.setAge(23);
        BookManyToMany book = new BookManyToMany();
        book.setBookName("The book of Tomorrow");
        BookManyToMany book1 = new BookManyToMany();
        book1.setBookName("Five Points Someone");
        Collection<BookManyToMany> book2 = new HashSet<>();
        book2.add(book);
        book2.add(book1);
        author.setBook(book2);
        author1.setBook(book2);
        author.setDob(Calendar.getInstance().getTime());
        author1.setDob(Calendar.getInstance().getTime());
Collection<AuthorManyToMany> authorManyToManies=new HashSet<>();
authorManyToManies.add(author);
authorManyToManies.add(author1);
        book.setAuthorManyToMany(authorManyToManies);
        book1.setAuthorManyToMany(authorManyToManies);
        session.beginTransaction();
        session.save(author);
        session.save(author1);
        session.save(book);
        session.save(book1);
        session.getTransaction().commit();

    }


}
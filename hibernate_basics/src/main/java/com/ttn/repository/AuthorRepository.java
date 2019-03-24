package com.ttn.repository;

import com.ttn.entity.Author;
import com.ttn.entity.AuthorOneToManyBi;
import com.ttn.entity.AuthorOneToManyUni;
import com.ttn.entity.Book;
import org.hibernate.Session;

public class AuthorRepository {

    private Session session=HibernateUtil.getSession();


    public void create(Author author){

        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();

    }

    public Author read(int id){

        session.beginTransaction();
        Author author=session.get(Author.class,2);
        session.getTransaction().commit();
        return author;

    }


    public void update(int id){
        session.beginTransaction();
        Author author=session.get(Author.class,id);
        author.setAge(50);
        session.save(author);
        session.getTransaction().commit();

    }


    public void delete(int id){
        session.beginTransaction();
        Author author=session.get(Author.class,id);
        session.delete(author);
        session.getTransaction().commit();

        /*Question 4 - create drop by closing sessionFactory*/

//        HibernateUtil.shutDown();

    }



}

package com.ttn.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static Session session;
   private static SessionFactory sessionFactory;
    static{
        sessionFactory=new Configuration().configure().buildSessionFactory();
    }

    private HibernateUtil(){

    }

public static Session getSession(){
        if(session==null)
            synchronized (HibernateUtil.class){
            if (session==null){
                session=sessionFactory.openSession();
            }
            }

        return session;
}


public static void shutDown(){
        session.close();
        sessionFactory.close();
}


}


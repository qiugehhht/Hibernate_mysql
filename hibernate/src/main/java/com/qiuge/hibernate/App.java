package com.qiuge.hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student ge = new Student();
        ge.setId(7);
        ge.setFirstName("G");
        ge.setLastName("F");
        ge.setEmail("F@qq.com");
        
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(ge);
        tx.commit();
        
        
    }
}

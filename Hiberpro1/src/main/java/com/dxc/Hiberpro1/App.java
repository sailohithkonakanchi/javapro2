package com.dxc.Hiberpro1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dxc.Hiberpro1.persist.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate example" );
        Configuration conf=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=conf.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Student obj=new Student();
        obj.setRoll(112);
        obj.setSname("prachi");
        obj.setCourse("btech");
        session.save(obj);
        t.commit();
        System.out.println("Done");
    }
}

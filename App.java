package com.deloitte.firstmvn.hibfirst;
import com.deloitte.firstmvn.hibfirst.entity.Employe;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Employe emp = new Employe(10,"Ajay Saxena",1000,new Date(2020,1,3));
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();
        session.save(emp);
        trans.commit();
        session.close();
        factory.close();
    }
}

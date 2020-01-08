package com.deloitte.firstmvn.hibthird;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.firstmvn.hibthird.entity.AadharCard;
import com.deloitte.firstmvn.hibthird.entity.Courses;
import com.deloitte.firstmvn.hibthird.entity.Department;
import com.deloitte.firstmvn.hibthird.entity.Employee;
import com.deloitte.firstmvn.hibthird.entity.Person;
import com.deloitte.firstmvn.hibthird.entity.Student;
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Courses.class);
        cfg.addAnnotatedClass(Student.class);
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Query qry = session.createQuery("from Department");
        List<Department> dlist = qry.list();
        for(Department d : dlist)
        {
        	System.out.println(d.getDeptno()+" "+d.getDname());
            List<Employee> elist = qry.list();
            for(Employee e : elist)
                System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getSalary());
        }
        session.close();
        factory.close();
    }
}

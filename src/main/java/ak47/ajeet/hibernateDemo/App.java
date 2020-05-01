package ak47.ajeet.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * 
 * Practice 
 *
 */  
public class App 
{
    public static void main( String[] args )
    {
    
    // To  write Data in database 
       Student student=new Student();
       StudentName studentName=new StudentName();
       studentName.setFirstname("Ak");
       studentName.setLastname("47");
       
       student.setName(studentName);
       student.setRollnumber(5);
       
       Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
       
       SessionFactory sf=cfg.buildSessionFactory();
       
       Session session=sf.openSession();
       
       Transaction transaction=session.beginTransaction();
       session.save(student);
       transaction.commit();
       
       
      // to fetch Data From database 
//       Student student=new Student();  no need to create object it work in null also
    	
//    	Student student=null;  
//    
//        
//        Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
//        
//        SessionFactory sf=cfg.buildSessionFactory();
//        
//        Session session=sf.openSession();
//        
//        Transaction transaction=session.beginTransaction();
//        
//        student=session.get(Student.class,1);
//        transaction.commit();
//        
//        System.out.println(student);
       
       
       
    }
}

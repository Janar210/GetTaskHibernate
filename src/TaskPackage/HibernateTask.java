package TaskPackage;

import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import HibernateConn.GetTask;

public class HibernateTask {

	public static void main(String[] args) throws Exception{
			GetTask t = new GetTask();
			
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session ses = sf.openSession();
			ses.beginTransaction();
			//Get All Tasks
			Query q=ses.createQuery("SELECT * FROM TaskManagement");
			
			List<String> l = (List<String>)q.list();
			ses.getTransaction().commit();
			ses.close();
			for (String s : l)
				System.out.println(s);
	}
}

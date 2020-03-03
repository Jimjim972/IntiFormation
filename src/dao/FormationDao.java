package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Formation;

public class FormationDao implements IFormationDao {
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	
	public int saveNewFormation(Formation f) {
	
		try 
		{
			session.beginTransaction();
			session.saveOrUpdate(f);
			session.getTransaction().commit();
			return 1;
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			return 0;
		}
	}

	
	public List<Formation> getAllFormation() {
		// TODO Auto-generated method stub
		
		List<Formation> liste= new ArrayList<Formation>();
		try 
		{
			session.beginTransaction();
			Query query =(Query) session.createQuery("SELECT * from Formation");
			liste=query.getResultList();
			return liste;
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			return null;
		}
	
	}

}

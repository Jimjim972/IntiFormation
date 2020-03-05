package dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Lieu;

public class LieuDao implements ILieuDao {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	
	@Override
	public int createLieu(Lieu lieu) {
		try {
			
			session.beginTransaction();
			session.saveOrUpdate(lieu);
			session.getTransaction().commit();
			return 1;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur createLieu() ");
			return 0; 
		}
	}

	@Override
	public List<Lieu> getLieux() {
		
		List<Lieu> liste= new ArrayList<Lieu>();
		try 
		{
			session.beginTransaction();
			liste =  session.createQuery(" from Lieu").list();
		
			return liste;
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			return null;
		}
	}

	

}

package main;

import java.util.List;

import dao.FormationDao;
import dao.IFormationDao;
import fr.adaming.model.Formation;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Formation f = new Formation();
		f.setTheme("Java/Jee");
		
		IFormationDao dao= new FormationDao();
		
		dao.saveNewFormation(f);
		List<Formation> list =dao.getAllFormation();
		System.out.println(list);
		
		
		

	}

}

package dao;

import java.util.List;

import fr.adaming.model.Formation;

public interface IFormationDao {
	
	public int saveNewFormation(Formation f);
	public List<Formation> getAllFormation();

}

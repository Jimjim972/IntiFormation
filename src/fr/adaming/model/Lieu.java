package fr.adaming.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	@Id
	@GeneratedValue
	private int idLieu;
	private String ville;
	private String adresse;
	
	@OneToMany
	List<Formation>formations;
	
	public Lieu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lieu(int idLieu, String ville, String adresse) {
		super();
		this.idLieu = idLieu;
		this.ville = ville;
		this.adresse = adresse;
	}

	public int getIdLieu() {
		return idLieu;
	}

	public void setIdLieu(int idLieu) {
		this.idLieu = idLieu;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	

}

package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue
	private int id;
	private String theme;
	
	@ManyToOne
	@JoinColumn
	private Lieu lieu;
	
	
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Formation(String theme, Lieu lieu) {
		super();
		this.theme = theme;
		this.lieu = lieu;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}

	

	public Lieu getLieu() {
		return lieu;
	}


	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}


	@Override
	public String toString() {
		return "Formation [id=" + id + ", theme=" + theme + "]";
	}
	
	

}

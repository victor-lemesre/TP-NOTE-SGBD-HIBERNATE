package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class employe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;

	public employe(String _nom){
		this.nom = _nom;
	}
}

package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class particulier  extends client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nom;
	private String prenom;
	private String telephone;

	public particulier(adresse _adresse, String _nom, String _prenom, String _telephone){
		super(_adresse);
		this.nom = _nom;
		this.prenom = _prenom;
		this.telephone = _telephone;
	}

}

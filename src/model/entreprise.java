package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class entreprise extends client {

	@Column(name="numero_TVA")
	private String numeroTVA;
	
	@Column(name="nom_societe")
	private String nomSociete;

	public entreprise(String _numeroTVA, String _nom, adresse _adresse){
		super(_adresse);
		this.nomSociete = _nom;
		this.numeroTVA = _numeroTVA;
	}
}

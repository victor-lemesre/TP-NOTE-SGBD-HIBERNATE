package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class entreprise extends client {

	@Column(name="numero_TVA")
	private String numeroTVA;
	
	@Column(name="nom_societe")
	private String nomSociete;

	@OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL)
	private List<telephone> liste_telephone;

	public entreprise(String _numeroTVA, String _nom, adresse _adresse){
		super(_adresse);
		this.nomSociete = _nom;
		this.numeroTVA = _numeroTVA;
		this.liste_telephone = new ArrayList<telephone>();
	}
}

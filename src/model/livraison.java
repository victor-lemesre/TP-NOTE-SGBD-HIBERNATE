package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class livraison {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "date-heure_livraison")
	private String DateHeureLivraison;

	@ManyToOne(cascade = CascadeType.ALL)	
	private contrat contrat;

	@OneToMany(mappedBy = "livraison", cascade = CascadeType.ALL)
	private List<meuble> liste_meubles;

	public livraison(String _DateLivraison, contrat _contrat){
		this.DateHeureLivraison = _DateLivraison;
		this.contrat = _contrat;
		this.liste_meubles = new ArrayList<meuble>();
	}
}

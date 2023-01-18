package model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class contrat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "date_conclusion")
	private String DateConclusion;
	
	@Column(name = "adresse_livraison")
	private adresse AdresseLivraison;

	@ManyToOne(cascade = CascadeType.ALL)	
	private client client;

	@ManyToOne(cascade = CascadeType.ALL)	
	private commercial commercial;

	@OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
	private List<livraison> ListeLivraison;

	@OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
	private List<meuble> ListeMeubles;

	public contrat(String _DateConclusion, adresse _adresse_livraison, client _client, commercial _commercial){
		this.DateConclusion = _DateConclusion;
		this.AdresseLivraison = _adresse_livraison;
		this.client = _client;
		this.commercial = _commercial;
		this.ListeLivraison = new ArrayList<livraison>();
		this.ListeMeubles = new ArrayList<meuble>();

	}

}

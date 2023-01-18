package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class meuble {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private float prix;
	private float longueur;
	private float largeur;
	private float hauteur;
	private String fournisseur;
	@Column(name="est_reserve")
	private boolean estReserve;

	@ManyToOne(cascade = CascadeType.ALL)	
	private livraison livraison;

	@ManyToOne(cascade = CascadeType.ALL)	
	private contrat contrat;

	public meuble(float _prix, float _longueur, float _largeur, float _hauteur, String _fournisseur, contrat _contrat, livraison _livraison){
		this.prix = _prix;
		this.longueur = _longueur;
		this.largeur = _largeur;
		this.hauteur = _hauteur;
		this.fournisseur = _fournisseur;
		this.estReserve = false;
		this.contrat = _contrat;
		this.livraison = _livraison; 
	}
}

package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

}

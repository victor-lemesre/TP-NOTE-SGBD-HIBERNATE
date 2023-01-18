package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class telephone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "num_telephone")
	private String numTelephone;

	@ManyToOne(cascade = CascadeType.ALL)	
	private entreprise entreprise;

	public telephone(String _telephone, entreprise _entreprise){
		this.numTelephone = _telephone;
		this.entreprise = _entreprise;
	}

}

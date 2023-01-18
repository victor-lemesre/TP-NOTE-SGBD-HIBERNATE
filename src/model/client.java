package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private adresse adresse_client;

    public client(adresse _adresse){
		this.adresse_client = _adresse;
	}

}

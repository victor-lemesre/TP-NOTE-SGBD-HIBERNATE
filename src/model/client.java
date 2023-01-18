package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String adresse;

	//test push
}

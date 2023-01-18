package model;
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

	public contrat(String _DateConclusion, adresse _adresse_livraison){
		this.DateConclusion = _DateConclusion;
		this.AdresseLivraison = _adresse_livraison;
	}

}

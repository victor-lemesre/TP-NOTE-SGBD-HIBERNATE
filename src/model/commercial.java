package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class commercial  extends employe{
	
	@OneToMany(mappedBy = "commercial", cascade = CascadeType.ALL)
	private List<contrat> listecontrats;


	public commercial(String _nom){
		super(_nom);
		this.listecontrats = new ArrayList<contrat>();
	}
}

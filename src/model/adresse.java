package model;

import javax.persistence.*;

@Entity
public class adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private int num;
	private String rue;
	private String CodePostal;
	private String ville;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Personne p;

	public Personne getP(){
		return p;
	}
	
	public void setP(Personne p){
		this.p = p;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return CodePostal;
	}

	public void setCodePostal(String codePostal) {
		CodePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}

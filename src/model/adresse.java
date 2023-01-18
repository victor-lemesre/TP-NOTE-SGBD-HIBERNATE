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
	private client client;

    public adresse(int _numero,String _rue, String _code, String _ville ){
        this.num = _numero;
        this.rue = _rue;
        this.CodePostal = _code;
        this.ville = _ville;
    }

	public client getP(){
		return client;
	}
	
	public void setP(client p){
		this.client = p;
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

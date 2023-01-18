package model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class fabricant extends employe{
    
    public fabricant(String _nom){
        super(_nom);
    }
}

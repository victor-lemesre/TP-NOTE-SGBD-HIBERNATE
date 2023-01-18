package model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class employeAdministratif extends employe{

    employeAdministratif(String _nom){
       super(_nom);
    }
}

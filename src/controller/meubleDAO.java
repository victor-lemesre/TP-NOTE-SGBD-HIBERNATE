package controller;

import java.util.List;

import javax.persistence.Query;

import bddutils.EntityClass;
import model.meuble;


public class meubleDAO {
	
public static List<meuble> getAllMeuble() {
		
		Query query = EntityClass.em.createQuery("from meuble"); 

		List<meuble> list = query.getResultList();

		return list;
	}

}

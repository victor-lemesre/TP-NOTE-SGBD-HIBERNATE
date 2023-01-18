package controller;

import java.util.List;

import javax.persistence.Query;

import bddutils.EntityClass;
import model.entreprise;

public class entrepriseDAO {
	public static List<entreprise> getAllEntreprise() {

		Query query = EntityClass.em.createQuery("from entreprise");

		List<entreprise> list = query.getResultList();

		return list;
	}

}

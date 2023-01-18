package controller;

import java.util.List;

import javax.persistence.Query;

import bddutils.EntityClass;
import model.particulier;

public class particulierDAO {
	public static List<particulier> getAllParticulier() {

		Query query = EntityClass.em.createQuery("from particulier");

		List<particulier> list = query.getResultList();

		return list;
	}

}

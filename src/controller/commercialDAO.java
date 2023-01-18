package controller;

import java.util.List;

import javax.persistence.Query;

import bddutils.EntityClass;
import model.commercial;

public class commercialDAO {

	public static List<commercial> getAllCommercial() {

		Query query = EntityClass.em.createQuery("from commercial");

		List<commercial> list = query.getResultList();

		return list;
	}

}

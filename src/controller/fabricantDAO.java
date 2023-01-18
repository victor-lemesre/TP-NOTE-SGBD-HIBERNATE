package controller;

import java.util.List;

import javax.persistence.Query;

import bddutils.EntityClass;
import model.fabricant;

public class fabricantDAO {

	public static List<fabricant> getAllFabricant() {

		Query query = EntityClass.em.createQuery("from fabricant");

		List<fabricant> list = query.getResultList();

		return list;
	}

}

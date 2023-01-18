package controller;

import java.util.List;

import javax.persistence.Query;

import bddutils.EntityClass;
import model.contrat;

public class contratDAO {

	public static List<contrat> getAllContrat() {

		Query query = EntityClass.em.createQuery("from contrat");

		List<contrat> list = query.getResultList();

		return list;
	}

}

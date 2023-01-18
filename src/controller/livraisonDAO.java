package controller;

import java.util.List;

import javax.persistence.Query;

import bddutils.EntityClass;
import model.livraison;

public class livraisonDAO {

	public static List<livraison> getAllLivraison() {

		Query query = EntityClass.em.createQuery("from livraison");

		List<livraison> list = query.getResultList();

		return list;
	}

}

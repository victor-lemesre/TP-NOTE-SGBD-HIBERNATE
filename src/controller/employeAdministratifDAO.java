package controller;

import java.util.List;

import javax.persistence.Query;

import bddutils.EntityClass;
import model.employeAdministratif;

public class employeAdministratifDAO {
	public static List<employeAdministratif> getAllEmployeAdministratif() {

		Query query = EntityClass.em.createQuery("from employe_administratif");

		List<employeAdministratif> list = query.getResultList();

		return list;
	}

}
